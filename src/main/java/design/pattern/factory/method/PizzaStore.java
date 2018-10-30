package design.pattern.factory.abstraction;

import design.pattern.factory.Pizza;

/**
 *
 * @author cherbini
 * 2018/10/29 14:31
 */
public abstract class PizzaStore
{
    public Pizza orderPizza(String type)
    {
        Pizza pizza;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
