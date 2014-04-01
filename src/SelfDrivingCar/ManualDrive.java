package SelfDrivingCar;

/**
 * Created by awilczek on 3/18/14.
 */
public class ManualDrive {
    private boolean manD;
    private boolean displayNav; //for Car to use whether to keep navigation on/off
    public void ManualDrive() {
        manD = true; //manual drive is engaged
        displayNav = true; //Navigation is viewable
    }

    public boolean isMan() { //for User class to use checking if in Auto Drive
        return manD;
    }

    public void setDriveMode(boolean manD) {
        this.manD = manD;
    }

    public void navTo(Navigation dest){ //take destination
        //Navigation destination = dest; Waiting for Navigation class to be comepleted
        //waiting for Navigation class to be completed
    }

    public boolean navStatus() { //returns Navigation Status to show Nav or not
        return displayNav;
    }

    public void setNavStat(boolean x) { //to display, or not to display Nav
        displayNav = x;
    }


}
