package SelfDrivingCar;

/**
 * Created by awilczek on 3/18/14.
 */
public class User {
    private String name;
    private boolean drivePermission = false;
    private boolean windowPermission = true;

    public class Settings {
        int windowPosition;
        int seatRecline;
        int seatX;
        int seatY;
        int insideTemp;
    }


    public User(String newName){
        public Settings prefs;
        name = newName;
    }

    public void updatePrefs(){
        prefs.windowPosition
    }

    public void setDriverPermission(boolean drive)
    {
        drivePermission = drive;
    }
    public void setPassPermission(boolean window){
        windowPermission = window;
    }



}
