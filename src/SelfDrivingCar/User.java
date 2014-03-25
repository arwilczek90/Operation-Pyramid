package SelfDrivingCar;

/**
 * Created by awilczek on 3/18/14.
 */
public class User {
    private String name = "Default User";
    private Boolean drivePermission = false;
    private Boolean windowPermission = true;
    private Zone passengerPref;
    private Zone driverPref;

    public void updateDriverPref(Zone currentSettings){
        // if currentSettings.type = driver
        driverPref = currentSettings;
    }

    public void updatePassengerPref(Zone currentSettings){
        // if currentSettings.type = passenger
        passengerPref = currentSettings;
    }

    public void setPermissions(boolean newDrive, boolean newWindow){
        windowPermission = newWindow;
        drivePermission = newDrive;
    }
}
