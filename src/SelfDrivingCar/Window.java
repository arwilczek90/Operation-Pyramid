package SelfDrivingCar;

/**
 * Created by awilczek on 3/18/14.
 */
public class Window {

    /**
     * The location of the window within the car
     */
    private String location;

    /**
     * The up or down position of the window
     */
    private int position;

    /**
     * Level of window tinting
     */
    private int tint;

    /**
     * Constructor method
     *
     * @param   winLocation     The location of the window within the car.
     */
    public void Window( String winLocation ) {
        this.location = winLocation;
        this.position = 99;
        this.tint = 30;
    }

    /**
     * Returns the location class variable
     */
    public String getLocation() {
        return location;
    }

    /**
     * Returns the position class variable
     */
    public int getPosition() {
        return position;
    }

    /**
     * Returns the tint class variable
     */
    public int getTint() {
        return tint;
    }

    /**
     * Sets the location class variable
     *
     * @param windowLocation
     */
    public void setLocation(String windowLocation) {
        this.location = windowLocation;
    }

    /**
     * Sets the position class variable
     *
     * @param windowPosition
     */
    public void setPosition(int windowPosition) {
        this.position = windowPosition;
    }

    /**
     * Sets the window tint level
     *
     * @param   newTint
     */
    public void setTint(int newTint) { this.tint = newTint; }

    /**
     * Increases the position class variable
     */
    public void windowUp() {
        int pos = this.getPosition();
        this.position = pos + 1;
    }

    /**
     * Decreases position class variable
     */
    public void windowDown() {
        int pos = this.getPosition();
        this.position = pos - 1;
    }

    /**
     * Increases position class variable to maximum value
     */
    public void fullyUp() {
        this.position = 99;
    }

    /**
     * Decreases position class variable to minimum value
     */
    public void fullyDown() {
        this.position = 0;
    }
}
