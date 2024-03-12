package pizzaStore;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        PizzaCookingFactory factory = new PizzaCookingFactory();
        List<AbstractPizza> pizzaOrderList = new ArrayList<>();

        PizzaOrder pizzaOrder = new PizzaOrder(factory, pizzaOrderList);

        //adding a hawaiian pizza and a supreme pizza to the order
        System.out.println("Adding Hawaiian pizza to the order...");
        pizzaOrder.addPizzaToCart(PizzaType.HAWAIIAN);
        System.out.println("Adding Supreme pizza to the order...");
        pizzaOrder.addPizzaToCart(PizzaType.SUPREME);

        //Adding a cooking strategy to the pizzas
        System.out.println("Applying cooking strategies...");
        AbstractPizza hawaiianPizza = pizzaOrder.getPizzaByOrderID(1);
        if (hawaiianPizza != null) {
            new BrickOvenCookingStrategy().cook(hawaiianPizza);
            System.out.println("Cooked Hawaiian pizza using Brick Oven.");
        }
        
        AbstractPizza supremePizza = pizzaOrder.getPizzaByOrderID(2);
        if (supremePizza != null) {
            new ConventionalOvenCookingStrategy().cook(supremePizza);
            System.out.println("Cooked Supreme pizza using Conventional Oven.");
        }

        //Running check out method
        try {
            System.out.println("Attempting to checkout...");
            double total = pizzaOrder.checkout();
            System.out.println("The total of this order is: $" + total);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Printing the final pizza order list
        System.out.println("Final pizza order list:");
        pizzaOrder.printPizzaOrderCart(1);
    }
}

