package pizzaStore;

public class PizzaCookingFactory {
	
	//Creates orderID integer that will be incremented each time a new pizza is created
	int orderID = AbstractPizza.getOrderIDCounter();
	
	//This method creates an AbstractPizza instance and instantiates it according to the pizzaType parameter.
	public AbstractPizza createPizza(PizzaType pizzaType) {
		
		AbstractPizza pizza = null;;
		
		//Print orderID for debug and testing purposes
		System.out.println(orderID);
		
		//Create switch cases for different types of pizza and returns the pizza/assigns an order id 
		switch (pizzaType) {
        case HAWAIIAN:
            pizza = new HawaiianPizza();
            pizza.setAbstractPizzaOrderID(orderID);
            break;
		case MARGHERITA:
        	pizza = new MargheritaPizza();
        	pizza.setAbstractPizzaOrderID(orderID);
        	break;
        case SUPREME:
            pizza = new SupremePizza();
            pizza.setAbstractPizzaOrderID(orderID);
            break;
		case VEGETARIAN:
        	pizza = new VegetarianPizza();
        	pizza.setAbstractPizzaOrderID(orderID);
        	break;
		default:
			//Throw exception if pizzaType does not match the cases above
        	throw new IllegalArgumentException("Unsupported pizza type: " + pizzaType);
		}
		
		//Increment orderID
		orderID++;
		
		//Print orderID for debug and testing purposes
		System.out.println(orderID);
		
		//Returns pizza created
		return pizza;
	}
}
