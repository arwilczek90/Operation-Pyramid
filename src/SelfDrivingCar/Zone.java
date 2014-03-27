package SelfDrivingCar;

/**
 * Created by awilczek on 3/18/14.
 */
public class Zone {
    boolean isDriver;
    Door door;
    Window window;
    Seat seat;
    ClimateControls climate;
    Display display;

    public Zone(boolean isDriver){
        isDriver = this.isDriver;
        door = new Door();
        window = new Window();
        seat = new Seat();
        climate = new ClimateControls();
        display = new Display();

    }

    public String getWindowLocation(){
        return window.getLocation();
    }

    public int getWindowPosition(){
        return window.getPosition();
    }

    public int getSeatRecline(){
        return seat.getRecline();
    }

    public int getSeatX(){
        return seat.getXPosition();
    }

    public int getSeatY(){
        return seat.getYPosition();
    }

    public int getInsideTemp(){
        return climate.getInTemp();
    }

    public void setWindowLocation(String location){
        window.setLocation(location);
    }

    public void setWindowPosition(int position){
        window.setPosition(position);
    }

    public void setSeat(int x, int y, int recline){
        seat.setX_Y_R(x, y, recline);
    }

    public void setInsideTemp(int temp){
        climate.setTemp(temp);
    }



}
