package SelfDrivingCar;

/**
 * Created by awilczek on 3/18/14.
 */
public class AutoDrive {
    private boolean autoD;
    private boolean displayNav;
    //private Navigation dest; Waiting for Navigation class to be comepleted

    public void AutoDrive() {
        autoD = true; //
    }

    public boolean isAuto() { //for User class to use checking if in Auto Drive
        return autoD;
    }

    public void setDriveMode(boolean autoD) {
        this.autoD = autoD;
    }

    public void navTo(Navigation dest){ //take destination
        //this.dest = dest;
        //waiting for Navigation class to be completed
    }

    public boolean navStatus() { //returns Navigation Status to show Nav or not
        return displayNav;
    }

    public void setNavStat(boolean x) { //to display, or not to display Nav
        displayNav = x;
    }
}
