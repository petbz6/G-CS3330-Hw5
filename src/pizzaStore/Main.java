package pizzaStore;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Instantiate a pizzaOrder, perform operations based on the requirements.
		PizzaCookingFactory fakespeareFactory = new PizzaCookingFactory();
		
		List<abstractPizza> pizzaOrderList = new ArrayList<>();
		
		PizzaOrder pizzaOrder = new PizzaOrder(fakespeareFactory, pizzaOrderList);
		
		pizzaOrder.addPizzaToCart(PizzaType.HAWAIIAN);
	
		pizzaOrder.addPizzaToCart(PizzaType.SUPREME);
		
		
		
		// Adds pizzas to the cart, selects cooking strategies for the pizzas in the cart,
		//prints pizza order cart. Calls checkout to calculate the bill, throws exception if
		//triggered.
		// TODO
		
	}

}
