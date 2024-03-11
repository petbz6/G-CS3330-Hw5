package pizzaStore;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Instantiate a pizzaOrder, perform operations based on the requirements.
		PizzaCookingFactory fakespeareFactory = new PizzaCookingFactory();
		
		List<AbstractPizza> pizzaOrderList = new ArrayList<>();
		
		PizzaOrder pizzaOrder = new PizzaOrder(fakespeareFactory, pizzaOrderList);
		
		pizzaOrder.addPizzaToCart(PizzaType.HAWAIIAN);
	
		pizzaOrder.addPizzaToCart(PizzaType.SUPREME);
		
		try {
			double total = pizzaOrder.checkout();
			System.out.println("The total of this order is: " + total);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			
		}
		
		
		
	
		
		
		
		// Adds pizzas to the cart, selects cooking strategies for the pizzas in the cart,
		//prints pizza order cart. Calls checkout to calculate the bill, throws exception if
		//triggered.
		// TODO
		
	}

}
