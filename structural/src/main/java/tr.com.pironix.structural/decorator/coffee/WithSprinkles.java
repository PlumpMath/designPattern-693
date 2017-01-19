package tr.com.pironix.structural.decorator.coffee;

/**
 * Created by kkbat on 7/24/2016.
 */
// Decorator WithSprinkles mixes sprinkles onto coffee.
// Note it extends CoffeeDecorator.
public class WithSprinkles extends CoffeeDecorator {
    public WithSprinkles(Coffee c) {
        super(c);
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.2;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", Sprinkles";
    }
}