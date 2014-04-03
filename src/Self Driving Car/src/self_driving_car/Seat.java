package self_driving_car;

/**
 * Created by awilczek on 3/18/14.
 */
public class Seat {

    private int recline = 50;
    private int yPosition = 25; // height, up/down position
    private int xPosition = 75; // forward/back position. lower is forward
    private final int max = 100; //max forward/upward/recline the seat may go
    private final int min = 1; //max backward/downward/recline the seat may go

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
        if(xPosition > min)
            xPosition --;
    }

    public void backward() {
        // increase x
        if(xPosition < max)
            xPosition ++;
    }

    public void reset() {
        // reset attributes to initial values
        recline = 50;
        yPosition = 25;
        xPosition = 75;
    }

    public void raise() {
        // increase y
        if(yPosition < max)
            yPosition++;
    }

    public void lower() {
        // decrease y
        if(yPosition > min)
            yPosition--;
    }

    public void recline() {
        // increase recline angle
        if(recline < max)
            recline++;
    }

    public void decline() {
        // decrease recline angle
        if(recline > min)
            recline --;
    }

}

