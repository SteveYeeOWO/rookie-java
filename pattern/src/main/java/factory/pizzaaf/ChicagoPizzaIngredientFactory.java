package factory.pizzaaf;

import factory.pizzaaf.cheese.Cheese;
import factory.pizzaaf.cheese.impl.MozzarellaCheese;
import factory.pizzaaf.dough.Dough;
import factory.pizzaaf.dough.impl.ThickCrustDough;
import factory.pizzaaf.pepperoni.Pepperoni;
import factory.pizzaaf.pepperoni.impl.SlicedPepperoni;
import factory.pizzaaf.sauce.Sauce;
import factory.pizzaaf.sauce.impl.PlumTomatoSauce;
import factory.pizzaaf.veggies.Veggies;
import factory.pizzaaf.veggies.impl.BlackOlives;
import factory.pizzaaf.veggies.impl.Eggplant;
import factory.pizzaaf.veggies.impl.Spinach;

/**
 * @author yayee
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies = {
                new BlackOlives(),
                new Spinach(),
                new Eggplant()
        };

        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }
}
