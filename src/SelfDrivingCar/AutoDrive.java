package SelfDrivingCar;

/**
 * Created by awilczek on 3/18/14.
 */
import java.util.*;


public class AutoDrive {
    private int throttleTension = 0;
    private int brakeTension = 0;
    private int speed;
    private int actualSpeed;
    private Random gen = new Random();

public void turn(int angle){
    int car = carAngle();
    int goal = carAngle() + angle;
        while (car < goal) {
            if (angle > 0) {
                turnWheels(false);
            } else {
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
public int getSpeed(){
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



/*public void turn(int angle){}
public void speed(int speed){}
public void park(){}
public void intersection(){}*/

//private void accelerate(){}
private int getGear(){return 1;}
private void turnWheels(){}
private void setGear(int gear){}
/*private void decelerate(){}
private void stop(){}
public int getSpeed(){return 100;}*/
private void setSpeed(int speed){}
private boolean checkAhead(){return false;}
private boolean checkSides(){return false;}
private boolean detectIntersectionState(){
    //hardware
    return false;
    }
}
