package pizzaStore;

public class HawaiianPizza extends AbstractPizza{

	public HawaiianPizza() {
        super();
        this.priceWithoutToppings = 3.50;
        this.toppingList.add(Toppings.TOMATO);
        this.toppingList.add(Toppings.CHEESE);
        this.toppingList.add(Toppings.BELL_PEPPER);
        this.toppingList.add(Toppings.ITALIAN_SAUSAGE);
        this.toppingList.add(Toppings.PEPPERONI);
        this.toppingList.add(Toppings.BLACK_OLIVE);
        this.toppingList.add(Toppings.MUSHROOM);
        this.totalPrice = addToppingsToPrice(this.priceWithoutToppings);
    }
	
	public HawaiianPizza(AbstractPizza abstractPizza) {
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
		return "HawaiianPizza [toppingList=" + toppingList + ", priceWithoutToppings=" + priceWithoutToppings
				+ ", totalPrice=" + totalPrice + ", abstractPizzaOrderID=" + abstractPizzaOrderID + ", cookingStrategy="
				+ cookingStrategy + ", cookingPrice=" + cookingPrice + ", updatePizzaPrice()=" + updatePizzaPrice()
				+ "]";
	}
}
