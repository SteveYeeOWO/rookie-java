package factory.pizzaaf;

import factory.pizzaaf.cheese.Cheese;
import factory.pizzaaf.cheese.impl.ReggianoCheese;
import factory.pizzaaf.dough.Dough;
import factory.pizzaaf.dough.impl.ThinCrustDough;
import factory.pizzaaf.pepperoni.Pepperoni;
import factory.pizzaaf.pepperoni.impl.SlicedPepperoni;
import factory.pizzaaf.sauce.Sauce;
import factory.pizzaaf.sauce.impl.MarinaraSauce;
import factory.pizzaaf.veggies.Veggies;
import factory.pizzaaf.veggies.impl.Garlic;
import factory.pizzaaf.veggies.impl.Mushroom;
import factory.pizzaaf.veggies.impl.Onion;
import factory.pizzaaf.veggies.impl.RedPepper;

/**
 * @author yayee
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough() {
        return new ThinCrustDough();
    }

    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    public Veggies[] createVeggies() {
        Veggies[] veggies = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
        return veggies;
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }
}
