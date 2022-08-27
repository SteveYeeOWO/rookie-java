package factory.pizzaaf;

import factory.pizzaaf.cheese.Cheese;
import factory.pizzaaf.dough.Dough;
import factory.pizzaaf.pepperoni.Pepperoni;
import factory.pizzaaf.sauce.Sauce;
import factory.pizzaaf.veggies.Veggies;

/**
 * @author yayee
 */
public interface PizzaIngredientFactory {
    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();

    Veggies[] createVeggies();

    Pepperoni createPepperoni();
}
