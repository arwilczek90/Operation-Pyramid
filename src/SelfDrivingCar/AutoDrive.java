package SelfDrivingCar;

/**
 * Created by awilczek on 3/18/14.
 */
import java.util.*;
import java.lang.*;

public class AutoDrive {
    private boolean autoD;
    private boolean displayNav;
    private int throttleTension = 0;
    private int brakeTension = 0;
    private int speed;
    private int actualSpeed;
    private Random gen = new Random();
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

    public void navTo(Navigation dest) { //take destination
        //this.dest = dest;
        //waiting for Navigation class to be completed
    }

    public boolean navStatus() { //returns Navigation Status to show Nav or not
        return displayNav;
    }

    public void setNavStat(boolean x) { //to display, or not to display Nav
        displayNav = x;
    }



public void turn(int angle){
    int car = carAngle();
    int goal = carAngle() + angle;
    while (car < goal){
        if(angle > 0){
            turnWheels(false);
        }
        else {
            turnWheels(true);
        }
    }
}
public void speed(int s){
    speed = s;
}
public void park(){
    //hardware, do you thang
}
public void intersection(){
    if(detectIntersectionState()){
        maintainSpeed();
    }
    else{
        stop();
        intersection();
    }
}

private void turnWheels(boolean left){
    //turn left if left is true
    //turn right if left is false
    //hardware
}

private int carAngle(){
    //hardware
    return 0;
}

//Speed handling
private int getSpeed(){
    actualSpeed = actualSpeed + gen.nextInt(6) - 3;
    return actualSpeed;
}
private void maintainSpeed(){
    if(checkAhead()){
        decelerate();
        maintainSpeed();
    }
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
private void stop(){
    throttleTension = 0;
    while(getSpeed() > 0) {
        brakeTension++;
    }
}


private boolean checkAhead(){
    //hardware
    //detect speed and position of cars/obstacles ahead
    return false;}
private boolean checkSides(){return false;}
private boolean detectIntersectionState(){
    //hardware
    return false;
    }
}