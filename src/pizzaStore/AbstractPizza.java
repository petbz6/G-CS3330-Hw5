package pizzaStore;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractPizza {
	
	protected List<Toppings> toppingList;
	protected double priceWithoutToppings;
	protected double totalPrice;
	protected int abstractPizzaOrderID;
	protected static int orderIDCounter;
	protected ICookingStrategy cookingStrategy;
	protected double cookingPrice;
	
	public AbstractPizza() {
        this.toppingList = new ArrayList<>();
    }
	
	public AbstractPizza(AbstractPizza abstractPizza) {
        this.toppingList = new ArrayList<>(abstractPizza.toppingList);
        this.priceWithoutToppings = abstractPizza.priceWithoutToppings;
        this.totalPrice = abstractPizza.totalPrice;
        this.abstractPizzaOrderID = abstractPizza.abstractPizzaOrderID;
        this.cookingStrategy = abstractPizza.cookingStrategy;
        this.cookingPrice = abstractPizza.cookingPrice;
    }

	public List<Toppings> getToppingList() {
		return toppingList;
	}

	public void setToppingList(List<Toppings> toppingList) {
		this.toppingList = toppingList;
	}

	public double getPriceWithoutToppings() {
		return priceWithoutToppings;
	}

	public void setPriceWithoutToppings(double priceWithoutToppings) {
		this.priceWithoutToppings = priceWithoutToppings;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public int getAbstractPizzaOrderID() {
		return abstractPizzaOrderID;
	}

	public void setAbstractPizzaOrderID(int abstractPizzaOrderID) {
		this.abstractPizzaOrderID = abstractPizzaOrderID;
	}

	public static int getOrderIDCounter() {
		return orderIDCounter;
	}

	public static void setOrderIDCounter(int orderIDCounter) {
		AbstractPizza.orderIDCounter = orderIDCounter;
	}

	public ICookingStrategy getCookingStrategy() {
		return cookingStrategy;
	}

	public void setCookingStrategy(ICookingStrategy cookingStrategy) {
		this.cookingStrategy = cookingStrategy;
	}

	public double getCookingPrice() {
		return cookingPrice;
	}

	public void setCookingPrice(double cookingPrice) {
		this.cookingPrice = cookingPrice;
	}

	protected abstract double addToppingsToPrice(double priceWithoutToppings);
		
	public abstract double updatePizzaPrice();
	
	
	
}
