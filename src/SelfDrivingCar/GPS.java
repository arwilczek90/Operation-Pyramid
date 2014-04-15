package SelfDrivingCar;

import java.util.*;

/**
 * Created by chriswilcoxson on 4/3/14.
 *
 * @link    https://www.google.com/maps/dir/1900+Belmont+Blvd,+Nashville,+TN+37212/Jackalope+Brewing+Co,+701+8th+Ave+S,+Nashville,+TN+37203/@36.1458051,-86.78662,14z/am=t/data=!4m13!4m12!1m5!1m1!1s0x8864669da44e0f67:0xcc8427b8e4e4a5f6!2m2!1d-86.7948295!2d36.1354973!1m5!1m1!1s0x8864666176278e2b:0xc5c1298a6ad79b54!2m2!1d-86.779335!2d36.150259
 */
public class GPS {

    /**
     * Where you're going
     */
    private String destination;

    /**
     * Where you are currently
     */
    private String origin;

    /**
     * When you should arrive
     */
    private Date eta;

    /**
     * An array of Direction objects
     */
    private Queue<Direction> directions;

    /**
     * A random generator
     */
    private Random r;

    /**
     * Sets class variables
     */
    public void GPS() {

        r = new Random();
        directions = new LinkedList<Direction>();

    } // End of GPS()

    /**
     * Sets the destination class variable
     */
    public void setDestination(String newDestination) { this.destination = newDestination; }

    /**
     * Sets the eta class variable
     */
    public void setEta(Date newEta) { this.eta = newEta; }

    /**
     * Sets the origin class variable
     */
    public void setOrigin(String newOrigin) { this.origin = newOrigin; }

    /**
     * Returns the destination class variable
     *
     * @return String  destination
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Returns the eta class variable
     *
     * @return String  eta
     */
    public Date getEta() {
        return eta;
    }

    /**
     * Returns the current origin
     *
     * @return String  origin
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * Returns a queue of direction instructions
     *
     * @return  Queue<Direction>  A queue of direction instructions
     */
    public Queue<Direction> getDirections() {

        return directions;

    } // End of getDirections()

    /**
     * Returns the next direction object
     *
     * @return  object
     */
    public Direction getNext() {

        directions.remove();

        return directions.peek();

    } // End of getNext()

    /**
     * Returns the current Direction object
     *
     * @return  object
     */
    public Direction getCurrentStep() {

        return directions.peek();

    } // End of getCurrentStep();

    public double getLatitude() {
        return 86 + (87 - 86) * r.nextDouble();
    }

    public double getLongitude() {
        return 36 + (36 - 36) * r.nextDouble();
    }

    /**
     * Adds Direction objects to the directions array
     *
     * @return  void
     */
    public void setDirections() {

        directions.add( new Direction( "Head west on Acklen Ave toward 17th Ave S", 160.934, .3 ) );
        directions.add( new Direction( "Turn right onto 18th Ave S", 28.0416, .1 ) );
        directions.add( new Direction( "Take the 1st right onto Magnolia Blvd", 160.934, .3 ) );
        directions.add( new Direction( "Take the 1st right onto Wedgewood Ave", 643.738, .5 ) );
        directions.add( new Direction( "Turn left onto 12th Ave S", 804.672, .7 ) );
        directions.add( new Direction( "Turn right onto Edgehill Ave", 804.672, .7 ) );
        directions.add( new Direction( "Turn left onto 8th Ave S", 965.606, .8 ) );

    }

} // End of GPS class