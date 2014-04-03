package SelfDrivingCar;

/**
 * Created by awilczek on 3/18/14.
 */
public class User {
    public String name;
    public boolean drivePermission = false;
    public boolean windowPermission = true;
    public int idNum;
    public int[] settings = new int[5];
   /*
        int windowTint;
        int seatRecline;
        int seatX;
        int seatY;
        int insideTemp;
    */


    public User(String newName){

        settings[0] = 99;
        settings[1] = 50;
        settings[2] = 25;
        settings[3] = 75;
        settings[4] = 72;
        name = newName;
    }

    public void setDriverPermission(boolean drive)
    {
        drivePermission = drive;
    }
    public void setPassPermission(boolean window){
        windowPermission = window;
    }



}
