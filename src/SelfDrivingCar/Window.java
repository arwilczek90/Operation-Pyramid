package SelfDrivingCar;

/**
 * Created by awilczek on 3/18/14.
 */
public class Window {

    private String location;
    private int position;

    public void Window(String location){
        this.location = location;
        position = 99;
    }

    public String getLocation() {
        return location;
    }

    public int getPosition() {
        return position;
    }

    public void setLocation(String windowLocation) {
        this.location = windowLocation;
    }

    public void setPosition(int windowPosition) {
        this.position = windowPosition;
    }

    public void windowUp() {

    }

    public void windowDown() {

    }

    public void fullyUp() {
        this.position = 99;
    }

    public void fullyDown() {
        this.position = 0;
    }
}
