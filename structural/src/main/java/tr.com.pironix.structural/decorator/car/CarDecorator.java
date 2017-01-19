package tr.com.pironix.structural.decorator.car;

/**
 * Created by kkbat on 7/24/2016.
 */
public class CarDecorator implements Car {

    protected Car car;

    public CarDecorator(Car c) {
        this.car = c;
    }

    @Override
    public void combine() {
        this.car.combine();
    }

}
