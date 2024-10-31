package decorator.pizza;

public class BasicPizza implements Pizza {
    private String size;

    public BasicPizza(String size) {
        this.size = size;
    }

    @Override
    public double cost() {
        if (size.equals("small")) {
            return 8.0;
        } else if (size.equals("medium")) {
            return 10.0;
        } else if (size.equals("large")) {
            return 12.0;
        } else {
            return 10.0;
        }
    }

    @Override
    public String getDescription() {
        return size + " pizza";
    }
}