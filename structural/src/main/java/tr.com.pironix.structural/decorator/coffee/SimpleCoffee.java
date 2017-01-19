package tr.com.pironix.structural.decorator.coffee;

/**
 * Created by kkbat on 7/24/2016.
 */
// Extension of a simple coffee without any extra ingredients
public class SimpleCoffee implements Coffee {


    @Override
    public double getCost() {
        return 1;
    }

    @Override
    public String getIngredients() {
        return "Coffee";
    }
}