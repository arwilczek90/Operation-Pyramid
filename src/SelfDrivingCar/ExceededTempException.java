package SelfDrivingCar;

/**
 * Created by chriswilcoxson on 3/27/14.
 *
 * @author      Chris Wilcoxson
 */
public class ExceededTempException extends Exception {
    /**
     * Constructor for objects of class ExceededTempException
     */
    public ExceededTempException()
    {
        super();
    }

    /**
     * Constructor for objects of class ExceededTempException
     * Includes the option for a message to pass up to the Exception class
     */
    public ExceededTempException( String message )
    {
        super( message );
    }
}
