package decorator.pizza;

public class PepperoniDecorator extends PizzaDecorator {
    public PepperoniDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double cost() {
        return pizza.cost() + 3.0;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " + pepperoni";
    }
}
