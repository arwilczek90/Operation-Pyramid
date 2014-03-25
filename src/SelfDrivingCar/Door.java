package SelfDrivingCar;

/**
 * Created by awilczek on 3/18/14.
 */
public class Door {

    private String status;
    private String location;

    public String getStatus() {
        return status;
    }

    public String getLocation() {
        return location;
    }

    public void setStatus(String doorStatus) {
        /*
        if ( "open" == doorStatus) {
            this.status = "open";
        } else if( "locked" == doorStatus ) {
            this.status = "locked";
        } else {
            this.status = "closed";
        }*/
    }

    public void setLocation(String doorLocation) {
        this.location = doorLocation;
    }

} // End of class
