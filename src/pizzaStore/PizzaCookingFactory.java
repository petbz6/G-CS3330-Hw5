package pizzaStore;

public class PizzaCookingFactory {
	
	//Creates orderID integer that will be incremented each time a new pizza is created
	int orderID = AbstractPizza.getOrderIDCounter();
	
	//This method creates an AbstractPizza instance and instantiates it according to the pizzaType parameter.
	public AbstractPizza createPizza(PizzaType pizzaType) {
		
		AbstractPizza pizza = null;;
		
		System.out.println(orderID);
		
		orderID++;
		
		System.out.println(orderID);
		
		//Create switch cases for different types of pizza and returns the pizza
		switch (pizzaType) {
        case HAWAIIAN:
            pizza = new HawaiianPizza();
            break;
		case MARGHERITA:
        	pizza = new MargheritaPizza();
        	break;
        case SUPREME:
            pizza = new SupremePizza();
            break;
		case VEGETARIAN:
        	pizza = new VegetarianPizza();
        	break;
		default:
        	throw new IllegalArgumentException("Unsupported pizza type: " + pizzaType);
		}
		return pizza;
	}
}
