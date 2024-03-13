# G-CS3330-Hw5

## Team:
- Kyle Young
- Pierce Terry
- Isaac Rider
- Andrew Hamilton

## Project Description
This project involves the automation of pizza store called FakeSpeare. There is an abstract base class named AbstractPizza with four subclasses named MargheritaPizza, VegetarianPizza, HawaiianPizza, and SupremePizza. There are three enums named PizzaType, Toppings and CookingStyleType. An interface is utilized with three subclasses (strategies) named BrickOvenCookingStrategy, ConventionalOvenCookingStrategy, MicrowaveCookingStrategy that represent the method in which the pizza is cooked. The PizzaOrder class manages the pizzaOrders by performing various tasks including printing the toppings for a specific pizza order, printing the pizzas in the pizzaOrderList, finding the pizza order with a given order ID, creating and adding a new pizza, adding toppings to a pizza order using its order ID, removing toppings from a pizza order, checking for uncooked pizzas, calculating the total price for for pizzas at checkout, and assigning a pizza order to a cooking strategy. Finally, the PizzaCookingFactory class creates instances of AbstractPizza based on the type of pizza requested and assigns a unique order ID to each pizza.
        

## How to Run/Compile Program
1. Open Eclipse
2. Click File - Import - Projects from Git - Clone URL - Paste the Github Repository URL - Finish
3. Open the Main File of the project
4. Click the green arrow button to run the program

## Dependencies
- java.util.ArrayList;
- java.util.List;

## Team Member Contributions
Kyle Young: 
- Main class
- Updated PizzaOrder class

Pierce Terry:
 - Project Setup/Class Structure
 - AbstractPizza class
 - Interface/Strategies

Isaac Rider: 
- Pizza subclasses
- PizzaOrder class

Andrew Hamilton: 
- PizzaCookingFactory class
