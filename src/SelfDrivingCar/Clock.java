package SelfDrivingCar;
import java.util.Date;
/**
 * Created by awilczek on 3/18/14.
 */
public class Clock {

    public void Clock(){

    }

    public String getTime()
    {
        String ret = "";
        Date d = new Date();
        ret = String.format("%h:m a",d);

        return ret;
    }
}
