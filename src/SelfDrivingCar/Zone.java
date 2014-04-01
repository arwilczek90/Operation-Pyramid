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
    User user;

    public Zone(boolean isDriver){
        isDriver = this.isDriver;
        door = new Door();
        window = new Window();
        seat = new Seat();
        climate = new ClimateControls();
        display = new Display();
        user = new User("Default");

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

    public User getUser() {
        return user;
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
        try {climate.setTemp(temp);}
        catch (ExceededTempException e) {
            System.err.println(e.getMessage());
        }
    }

    public boolean changeUser(User newUser, boolean update){
        if (isDriver == true && user.drivePermission == false){return false;}
        else {
            if (update = true) {
                updateUserSettings();
            }
            //not sure if we want to open the window for people
            //setWindowPosition(newUser.settings[0]);
            setSeat(newUser.settings[2], newUser.settings[3], newUser.settings[1]);
            setInsideTemp(newUser.settings[4]);
            user = newUser;
            return true;
        }
    }
    public void updateUserSettings(){
        user.settings[0] = getWindowPosition();
        user.settings[1] = getSeatRecline();
        user.settings[2] = getSeatX();
        user.settings[3] = getSeatY();
        user.settings[4] = getInsideTemp();
    }
}
