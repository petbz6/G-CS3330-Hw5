package pizzaStore;

public class HawaiianPizza extends AbstractPizza{

	public HawaiianPizza() {
        super();
        this.priceWithoutToppings = 3.00;
        this.toppingList.add(Toppings.CANADIAN_BACON);
        this.toppingList.add(Toppings.CHEESE);
        this.toppingList.add(Toppings.PINEAPPLE);
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
