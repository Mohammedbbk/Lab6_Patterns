package decorator.pizza;

public class CheeseDecorator extends PizzaDecorator {
    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double cost() {
        return pizza.cost() + 2.0;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " + cheese";
    }
}

