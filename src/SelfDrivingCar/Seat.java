package SelfDrivingCar;

/**
 * Created by awilczek on 3/18/14.
 */
public class Seat {

    private int recline;
    private int yPosition; // height, up/down position
    private int xPosition; // forward/back position

    public int getXPosition () {
        return xPosition;
    }

    public int getYPosition () {
        return yPosition;
    }

    public int getRecline () {
        return recline;
    }

    public void forward() {
        // reduce x
    }

    public void backward() {
        // increase x
    }

    public void reset() {
        // holds initial values
    }

    public void raise() {
        // increase y
    }

    public void lower() {
        // decrease y
    }

    public void recline() {
        // increase recline angle
    }

    public void decline() {
        // decrease recline angle
    }

}

