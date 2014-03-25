package SelfDrivingCar;

/**
 * Created by awilczek on 3/18/14.
 */
public class Door {

    /**
     * The status of the door: locked, closed, or open
     */
    private String status;

    /**
     * The location of the door within the car: driver or passenger
     */
    private String location;

    /**
     * Return status class variable
     *
     * @return  status class variable
     */
    public String getStatus() {
        return status;
    }

    /**
     * Returns Location class variable
     *
     * @return  location class variable
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets Status class variable
     *
     * @param   doorStatus
     */
    public void setStatus(String doorStatus) {
        // if doorStatus is not open, closed, or locked, return
        if ( doorStatus.equals("open") || doorStatus.equals("locked") || doorStatus.equals("closed") ) { return; }
        // otherwise, set status as doorStatus
        this.status = doorStatus;
    }

    /**
     * Sets Location class variable
     *
     * @param   doorLocation
     */
    public void setLocation(String doorLocation) {
        // if doorLocation is not driver or passenger, return
        if ( doorLocation.equals("driver") || doorLocation.equals("passenger") ) { return; }
        // otherwise set location as doorLocation
        this.location = doorLocation;
    }

} // End of class
