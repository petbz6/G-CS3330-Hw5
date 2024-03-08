package pizzaStore;

public class MicrowaveCookingStrategy implements ICookingStrategy {

    @Override
    public boolean cook(AbstractPizza pizza) {
        if (pizza != null) {
            pizza.setCookingPrice(1.0);
            pizza.setCookingStrategy(this);
            pizza.updatePizzaPrice();
            return true;
        }
        return false;
    }
    
    @Override
    public String toString() {
        return "Microwave";
    }
}
