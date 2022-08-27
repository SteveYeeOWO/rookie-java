package factory.pizzafm;

/**
 * @author yayee
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String item) {

        switch (item) {
            case "cheese":
                return new ChicagoStyleCheesePizza();
            case "veggie":
                return new ChicagoStyleVeggiePizza();
            case "pepperoni":
                return new ChicagoStylePepperoniPizza();
            default:
                return null;
        }

    }
}
