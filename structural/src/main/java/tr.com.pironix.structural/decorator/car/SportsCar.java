package tr.com.pironix.structural.decorator.car;

/**
 * Created by kkbat on 7/24/2016.
 */
public class SportsCar extends CarDecorator {

    public SportsCar(Car c) {
        super(c);
    }

    @Override
    public void combine() {
        super.combine();
        System.out.print(" Adding features of Sports Car.");
    }
}
