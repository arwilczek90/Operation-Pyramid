package SelfDrivingCar;

import java.sql.*;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;

import org.sqlite.JDBC;

/**
 * Created by awilczek on 3/18/14.
 */
public class Car {
    public ArrayList<User> users;
    Connection c = null;
    Statement stmt;
    Zone zone1;
    Zone zone2;
    Info ret;
    AutoDrive auto;
    public void setZone1User(User u)
    {
        zone1.changeUser(u, true);
    }

    public void setZone2User(User u)
    {
        zone2.changeUser(u, true);
    }

    public User getUser1()
    {
        return zone1.getUser();
    }

    public User getUser2()
    {
        return zone2.getUser();
    }

    public Car() {
        auto = new AutoDrive();
        zone1 = new Zone(true);
        zone2 = new Zone(false);
        ret = new Info();
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:Car.db");
        }

        catch(Exception e)
        {
            System.out.println("An Exception occured at " );
            e.printStackTrace();
            System.out.println(e.getLocalizedMessage());
        }
        try {
            stmt = c.createStatement();
            File f = new File("Car.db");
            if(!f.exists() && f.isDirectory()) { stmt.executeUpdate("CREATE DATABASE CAR") ;
            System.out.println("Creating Database");
            }
        }
        catch(Exception e)
        {

        }

        try
        {
            Runnable r = new Runnable()  {
                public void run() {
                    while(true)
                    {
                        Random rand = new Random();
                        ret.speed = auto.getSpeed();
                        ret.rpm = rand.nextInt();
                        try {
                            Thread.sleep(100);
                        }
                        catch(InterruptedException e)
                        {

                        }
                        System.out.println(getInfo().toString());

                    }
                }
            };

            new Thread(r).start();
        }
        catch(Exception e)
        {

        }

        try {
            String sql = "CREATE TABLE IF NOT EXISTS Users " +
                    "(ID INT PRIMARY KEY     NOT NULL," +
                    " NAME           TEXT    NOT NULL, " +
                    " DrivePermission            BIT     NOT NULL, " +
                    " WindowPermission        BIT  NOT NULL, " +
                    " WindowPosition         INT NOT NULL,"
                    +"SeatRecline INT NOT NULL,"
                    +"SeatX INT NOT NULL,"
                    +"SeatY INT NOT NULL,"
                    +"InsideTemp INT NOT NULL)";
            stmt.executeUpdate(sql);
         //   stmt.close();
          //  c.close();
        }

        catch(Exception e)
        {
            System.out.println("An Exception occured at " );
            e.printStackTrace();
            System.out.println(e.getLocalizedMessage());
        }


        users = new ArrayList<User>();





    }






    public void populateUsers()
    {
        Statement stmt1;
        try {
            stmt1 = c.createStatement();
            ResultSet rs = stmt1.executeQuery("SELECT * FROM Users;");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                boolean DrivePermission = rs.getBoolean("DrivePermission");
                boolean WindowPermission = rs.getBoolean("WindowPermission");
                int windowPosition = rs.getInt("WindowPermission");
                int seatRecline = rs.getInt("SeatRecline");
                int seatX = rs.getInt("SeatX");
                int seatY = rs.getInt("SeatY");
                int InsideTemp = rs.getInt("InsideTemp");
                User u = new User(name);
                u.setDriverPermission(DrivePermission);
                u.setPassPermission(WindowPermission);
                u.idNum = id;
                u.settings[0] = windowPosition;
                u.settings[1] = seatRecline;
                u.settings[2] = seatX;
                u.settings[3] = seatY;
                u.settings[4] = InsideTemp;
                users.add(u);


            }
            rs.close();
            stmt1.close();
        }
        catch(Exception e)
        {
            System.out.println("An Exception occured at " );
            e.printStackTrace();
            System.out.println(e.getLocalizedMessage());
        }
    }

    public void shutdown()
    {
        try {
            stmt = c.createStatement();
            PreparedStatement prep = c.prepareStatement("IF EXISTS (UPDATE Users set NAME = ? DrivePermission = ? windowPermission= ? SeatRecline = ? SeatX = ? SeatY = ? InsideTemp = ? Where ID = ?) ELSE (Insert Into Users(?,?,?,?,?,?,?,?))");
            ResultSet rs = stmt.executeQuery("UPDATE Users ");
        }
        catch(Exception e)
        {

        }
    }



    public Info getInfo()
    {


        return ret;
    }



}
