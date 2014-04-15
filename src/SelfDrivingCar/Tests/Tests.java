import SelfDrivingCar.Car;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by awilczek on 4/8/14.
 */
public class Tests {
    @Test
    public void testInit()
    {

        Car car = new Car();
        System.out.println(car.getInfo());
        car.populateUsers();
        car.setZone1User(car.users.get(0));
        Assert.assertEquals(car.getUser1().toString(),1 + " " +"Adam" + " " + true + " " + true + " " + 0 + " " + 0 + " " + 0 + " " + 0 + " " + 98 );



        car.shutdown();
    }
}
