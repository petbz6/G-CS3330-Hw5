package pizzaStore;

public class ConventionalOvenCookingStrategy implements ICookingStrategy {

    @Override
    public boolean cook(AbstractPizza pizza) {
        if (pizza != null) {
            pizza.setCookingPrice(8.0);
            pizza.setCookingStrategy(this);
            pizza.updatePizzaPrice();
            return true;
        }
        return false;
    }
    
    @Override
    public String toString() {
        return "Conventional Oven";
    }
}
