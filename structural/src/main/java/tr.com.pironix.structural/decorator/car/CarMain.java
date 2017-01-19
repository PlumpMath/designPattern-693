package tr.com.pironix.structural.decorator.car;

/**
 * Created by kkbat on 7/24/2016.
 */
public class CarMain {

    public static void main(String[] args) {
        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.combine();
        System.out.println("\n*****");

        Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
        sportsLuxuryCar.combine();
    }
}
