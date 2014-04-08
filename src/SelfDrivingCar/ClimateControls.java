package SelfDrivingCar;

/**
 * Created by awilczek on 3/18/14.
 */
public class ClimateControls {

    /**
     * The internal temperature
     */
    private int inTemp;

    /**
     * The external temperature
     */
    private int outTemp;

    /**
     * The maximum allowed temperature
     */
    private final int max = 90;

    /**
     * The minimum allowed temperature
     */
    private final int minimum = 60;

    /**
     * Constructor method
     */
    public void ClimateControls() {
        this.inTemp = 72;
        this.outTemp = 85;
    }

    /**
     * Returns the internal temperature
     *
     * @return  inTemp
     */
    public int getInTemp() {
        return inTemp;
    }

    /**
     * Returns the external temperature
     *
     * @return  outTemp
     */
    public int getOutTemp() {
        return outTemp;
    }

    /**
     * Set the temperature for the zone
     * Checks against the minimum and max allowed temperature and throws an ExceededTempException.
     *
     * @param   setTemp
     * @throws  ExceededTempException
     */
    public void setTemp(int setTemp) throws ExceededTempException {
        if ( setTemp > max ) {
            throw new ExceededTempException( "Too hot! Please lower the temperature below " + max + "." );
        }

        if ( setTemp < minimum ) {
            throw new ExceededTempException( "Too cold! Please raise the temperature above " + minimum + "." );
        }

        this.inTemp = setTemp;
    }

    /**
     * Increases the inTemp class variable
     */
    public void tempUp() {
        int temp = this.getInTemp();
        this.inTemp = temp + 1;
    }

    /**
     * Decreases the inTemp class variable
     */
    public void tempDown() {
        int temp = this.getInTemp();
        this.inTemp = temp - 1 ;
    }
}
