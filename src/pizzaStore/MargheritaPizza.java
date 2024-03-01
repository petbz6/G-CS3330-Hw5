package pizzaStore;

public class MargheritaPizza extends AbstractPizza {
	
    public MargheritaPizza() {
        super();
        this.priceWithoutToppings = 2.50;
        this.toppingList.add(Toppings.TOMATO);
        this.toppingList.add(Toppings.CHEESE);
        this.totalPrice = addToppingsToPrice(this.priceWithoutToppings);
    }
    
    //Copy Constructor
    public MargheritaPizza(AbstractPizza abstractPizza) {
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
		return "MargheritaPizza [toppingList=" + toppingList + ", priceWithoutToppings=" + priceWithoutToppings
				+ ", totalPrice=" + totalPrice + ", abstractPizzaOrderID=" + abstractPizzaOrderID + ", cookingStrategy="
				+ cookingStrategy + ", cookingPrice=" + cookingPrice + ", updatePizzaPrice()=" + updatePizzaPrice()
				+ "]";
	}
}
