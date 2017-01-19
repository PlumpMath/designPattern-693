package tr.com.pironix.structural.decorator.car;

/**
 * Created by kkbat on 7/24/2016.
 */
public class BasicCar implements Car {
    @Override
    public void combine() {
        System.out.println("Assemble Basic Car");
    }
}
