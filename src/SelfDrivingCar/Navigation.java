package SelfDrivingCar;

/**
 * Created by awilczek on 3/18/14.
 */

public class Navigation {

    /**
     * An instance of the GPS class
     */
    GPS gps;

    /**
     * An instance of the AutoDrive class
     *
     * Methods:
     *  turn (int angle)
     *  speed (int speed)
     *  park()
     *  intersection()
     */
    AutoDrive autodrive;

    /**
     * Current latitude
     */
    double currentLat;

    /**
     * Current longitude
     */
    double currentLong;

    /**
     * Sets class variables
     */
    public void Navigation() {

        gps         = new GPS();
        autodrive   = new AutoDrive();

    } // End of Navigation()

    /**
     * Sets the currentLong class variable
     *
     * @param   newLong
     *
     * @return  void
     */
    public void setLong( double newLong ) {

        currentLong = newLong;

    } // End of setLong()

    /**
     * Sets the currentLat class variable
     *
     * @param   newLat
     *
     * @return  void
     */
    public void setLat( double newLat  ) {

        currentLat = newLat;

    } // End of setLat()

    /**
     * Returns the currentLong class variable
     *
     * @return  double      currentLong
     */
    public double getLong() { return currentLong; }

    /**
     * Returns the currentLat class variable
     *
     * @return  double      currentLat
     */
    public double getLat() { return currentLat; }

    /**
     * Updates the currentLat and currentLong every second
     */
    public void updatePosition() {

        int speed = autodrive.getSpeed();

        while ( speed != 0 ) {

            setLat( gps.getLatitude() );
            setLong( gps.getLongitude() );

        } // End of while loop

    } // End of updatePosition()

    /**
     * Sets the new speed
     *
     * @param   newSpeed
     */
    public void setSpeed( int newSpeed ) {

        autodrive.speed( newSpeed );

    } // End of setSpeed

    /**
     * Returns the next step text from directions
      */
    public String getNextStep() {

        Direction dirStep = gps.getNext();

        return dirStep.getInstruction();

    } // End of getNextStep()

    /**
     * Returns the distance (in miles) to next turn
     *
     * @return  double      distanceToNextTurn
     */
    public double getDistanceToNextTurn() {

        Direction dirStep = gps.getCurrentStep();

        return dirStep.getDistance();

    } // End of getDistanceToNextTurn()

    /**
     * Returns the (approx) minutes to next turn
     *
     * @return  double
     */
    public double getDurationToNextTurn() {

        Direction dirStep = gps.getCurrentStep();

        return dirStep.getDuration();

    } // End of getDurationToNextTurn()

} // End of Navigation class