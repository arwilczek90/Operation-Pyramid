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
     * Returns the next step from Google Directions
      */
    public void getNextStep() {

        //return gps.getNext();

    } // End of getNextStep()








    /**
     * Sets the new speed
     *
     * @param   newSpeed
     */
    public void setSpeed( int newSpeed ) {

        autodrive.speed( newSpeed );

    } // End of setSpeed

    /**
     * Returns the distance (in miles) to next turn
     *
     * @return  double      distanceToNextTurn
     */
    public void getDistanceToNextTurn() {

       // double distance;

//        distance = gps.

        //double distance;
        //double turnLat;
        //double turnLong;





        // get the distance from the directions
        // calculate from currentLat & currentLong?

        //return distance;

        return;

    } // End of getDistanceToNextTurn()

    /**
     * Loops through distance to next turn until it is less than or equal to 50 meters away
     * Then it calls Autodrive's intersection method to check the intersection ahead
     */
    public void driving() {

        double distanceToNextTurn = 0;
        boolean clear;

        do {

            //distanceToNextTurn = getDistanceToNextTurn();
            //Thread.sleep(1000);

        } while ( distanceToNextTurn > 50 );

        autodrive.intersection();


    } // End of driving()


    // Autodrive commands

    // turn( String: left / right )
    // setSpeed( int )
    // park

} // End of Navigation class