package SelfDrivingCar;

import java.util.Random;

/**
 * Created by awilczek on 3/18/14.
 */
public class ManualDrive {
    private boolean manD;
    private boolean displayNav; //for Car to use whether to keep navigation on/off
    private int throttleTension = 0;
    private int brakeTension = 0;
    private int speed;
    private int actualSpeed;
    private Random gen = new Random();

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
        //Navigation destination = dest; Waiting for Navigation class to be completed
        //waiting for Navigation class to be completed
    }

    public boolean navStatus() { //returns Navigation Status to show Nav or not
        return displayNav;
    }

    public void setNavStat(boolean x) { //to display, or not to display Nav
        displayNav = x;
    }
    public void cruise(int speed){
        maintainSpeed();
    }
    private void maintainSpeed(){
        while (getSpeed() != speed){
            if (actualSpeed > speed){
                decelerate();
            }
            else if (actualSpeed < speed){
                accelerate();
            }
        }
        maintainSpeed();
    }
    private void accelerate(){
        brakeTension = 0;
        throttleTension++;
    }
    private void decelerate(){
        throttleTension--;
        brakeTension++;
    }
    private int getSpeed(){
        actualSpeed = actualSpeed + gen.nextInt(6) - 3;
        return actualSpeed;
    }


}