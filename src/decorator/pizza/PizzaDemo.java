package decorator.pizza;

public class PizzaDemo {
    public static void main(String[] args) {
        Pizza pizza = new BasicPizza("medium");
        pizza = new CheeseDecorator(pizza);
        pizza = new PepperoniDecorator(pizza);

        System.out.println("Order: " + pizza.getDescription());
        System.out.println("Total Cost: $" + pizza.cost());
    }
}