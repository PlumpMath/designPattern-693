package tr.com.pironix.structural.decorator.coffee;

/**
 * Created by kkbat on 7/24/2016.
 */
// Decorator WithMilk mixes milk into coffee.
// Note it extends CoffeeDecorator.
public class WithMilk extends CoffeeDecorator {
    public WithMilk(Coffee c) {
        super(c);
    }

    @Override
    public double getCost() { // Overriding methods defined in the abstract superclass

        return super.getCost() + 0.5;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", Milk";
    }
}
