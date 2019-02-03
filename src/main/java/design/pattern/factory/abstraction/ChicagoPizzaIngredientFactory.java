package design.pattern.factory.abstraction;

import design.pattern.factory.abstraction.ingredient.*;

/**
 * @author cherbini
 * 2018/10/30 15:08
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory
{
    @Override
    public Dough createDough()
    {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce()
    {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese()
    {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies()
    {
        Veggies [] veggies={new Cabbage(),new Radish(),new Carrot(),new Kale()};
        return veggies;
    }

    @Override
    public Clams createClam()
    {
        return new FrozenClams();
    }
}
