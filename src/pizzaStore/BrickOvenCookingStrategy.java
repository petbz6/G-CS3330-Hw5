package pizzaStore;

public class BrickOvenCookingStrategy implements ICookingStrategy {

    @Override
    public boolean cook(AbstractPizza pizza) {
        if (pizza != null) {
            pizza.setCookingPrice(10.0);
            pizza.setCookingStrategy(this);
            pizza.updatePizzaPrice();
            return true;
        }
        return false;
    }
    
    @Override
    public String toString() {
        return "Brick Oven";
    }
}
