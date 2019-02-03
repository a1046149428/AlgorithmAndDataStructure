package design.pattern.factory.abstraction;

import design.pattern.factory.abstraction.ingredient.*;

/**
 * @author cherbini
 * 2018/10/30 15:00
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory
{
    @Override
    public Dough createDough()
    {
        return new ThinCrustDouth();
    }

    @Override
    public Sauce createSauce()
    {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese()
    {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies()
    {
        Veggies[] veggies= {new Garlic(),new Onion(),new MushRoom(),new RedPapper()};
        return veggies;
    }

    @Override
    public Clams createClam()
    {
        return new FleshClams();
    }
}
