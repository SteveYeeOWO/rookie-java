package factory.pizzafm;

/**
 * @author yayee
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String item) {

        switch (item) {
            case "cheese":
                return new NYStyleCheesePizza();
            case "veggie":
                return new NYStyleVeggiePizza();
            case "pepperoni":
                return new NYStylePepperoniPizza();
            default:
                return null;
        }
    }
}
