package SelfDrivingCar;

/**
 * Created by awilczek on 3/18/14.
 */
public class ClimateControls {

    private int inTemp;
    private int outTemp;
    private final double max = 90;
    private final double minimum = 60;

    public int getInTemp() {
        return inTemp;
    }

    public int getOutTemp() {
        return outTemp;
    }

    public void setTemp(int setTemp) {
        // error check setTemp - cannot exceed max or lower than minimum
        this.inTemp = setTemp;
    }

    public void tempUp() {

    }

    public void tempDown() {

    }

}
