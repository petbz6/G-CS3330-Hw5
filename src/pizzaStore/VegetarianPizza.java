package pizzaStore;

public class VegetarianPizza extends AbstractPizza{

	public VegetarianPizza() {
        super();
        this.priceWithoutToppings = 1.50;
        this.toppingList.add(Toppings.TOMATO);
        this.toppingList.add(Toppings.CHEESE);
        this.toppingList.add(Toppings.BELL_PEPPER);
        this.toppingList.add(Toppings.BLACK_OLIVE);
        this.toppingList.add(Toppings.MUSHROOM);
        this.totalPrice = addToppingsToPrice(this.priceWithoutToppings);
    }
	
	public VegetarianPizza(AbstractPizza abstractPizza) {
		super(abstractPizza);
	}
	
	@Override
	protected double addToppingsToPrice(double priceWithoutToppings) {
		double totalPrice = priceWithoutToppings;
        for (Toppings topping : toppingList) {
        	totalPrice += topping.getToppingPrice();
        }
		return totalPrice;
	}

	@Override
	public double updatePizzaPrice() {
		this.totalPrice = addToppingsToPrice(this.priceWithoutToppings);
        return this.totalPrice;
	}

	@Override
	public String toString() {
		return "VegetarianPizza [toppingList=" + toppingList + ", priceWithoutToppings=" + priceWithoutToppings
				+ ", totalPrice=" + totalPrice + ", abstractPizzaOrderID=" + abstractPizzaOrderID + ", cookingStrategy="
				+ cookingStrategy + ", cookingPrice=" + cookingPrice + ", updatePizzaPrice()=" + updatePizzaPrice()
				+ "]";
	}
}
