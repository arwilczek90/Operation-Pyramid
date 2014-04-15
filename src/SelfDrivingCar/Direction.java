package SelfDrivingCar;

import java.util.*;

/**
 * Created by chriswilcoxson on 4/10/14.
 */
public class Direction {

    /**
     * The instruction string for this direction step
     */
    private String instruction;

    /**
     * The distance in meters to the next step
     */
    private double distance;

    /**
     * The approximate time until the next step
     */
    private double duration;

    public Direction(String instruction, double distance, double duration) {

        this.instruction = instruction;
        this.distance = distance;
        this.duration = duration;

    } // End of Direction()

    /**
     * Sets the class variable: instruction
     *
     * @param instruction
     */
    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    /**
     * Sets the class variable: distance
     *
     * @param distance
     */
    public void setDistance(double distance) {
        this.distance = distance;
    }

    /**
     * Sets the class variable: duration
     *
     * @param duration
     */
    public void setDuration(double duration) {
        this.duration = duration;
    }

    /**
     * Returns the class variable: instruction
     *
     * @return
     */
    public String getInstruction() {
        return instruction;
    }

    /**
     * Returns the class variable: distance
     *
     * @return
     */
    public double getDistance() {
        return distance;
    }

    /**
     * Returns the class variable: duration
     *
     * @return
     */
    public double getDuration() {
        return duration;
    }

} // End of class
