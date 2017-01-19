package tr.com.pironix.structural.decorator.coffee;

/**
 * Created by kkbat on 7/24/2016.
 */

public class MainCoffee {

    public static void main(String[] args) {
        Coffee c = new SimpleCoffee();
        System.out.println("Cost: " + c.getCost() + "; Ingredients: " + c.getIngredients());

        c = new WithMilk(c);
        System.out.println("Cost: " + c.getCost() + "; Ingredients: " + c.getIngredients());

        c = new WithSprinkles(c);
        System.out.println("Cost: " + c.getCost() + "; Ingredients: " + c.getIngredients());

        Coffee c2 = new WithMilk(new WithSprinkles(new WithMilk(new SimpleCoffee())));
        System.out.println("Cost 2: " + c2.getCost() + "; Ingredients 2 : " + c2.getIngredients());

    }
}