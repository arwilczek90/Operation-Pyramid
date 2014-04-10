package SelfDrivingCar;

import java.sql.*;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by awilczek on 3/18/14.
 */
public class Car {
    ArrayList<User> users;
    Connection c = null;
    Statement stmt;
    public Car() {

        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:Car.db");
        }

        catch(Exception e)
        {

        }

        try {
            stmt = c.createStatement();
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
            stmt.close();
          //  c.close();
        }

        catch(Exception e)
        {

        }


        users = new ArrayList<User>();





    }






    public void populateUsers()
    {
        User u = new User();
        try {
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Users;");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                boolean DrivePermission = rs.getBoolean("DrivePermission");
                boolean WindowPermission = rs.getBoolean("WindowPermission");
                int windowPermission = rs.getInt("WindowPermission");
                int seatRecline = rs.getInt("SeatRecline");
                int seatX = rs.getInt("SeatX");
                int seatY = rs.getInt("SeatY");
                int InsideTemp = rs.getInt("InsideTemp");
                //insert user code next time
            }
            rs.close();
            stmt.close();
        }
        catch(Exception e)
        {

        }
    }

    public void shutdown()
    {

    }



    public Info getInfo()
    {
        Info ret = new Info();

        return ret;
    }



}
