package designpattern.factory;

/**
 * @author cherbini
 * 2018/10/26 10:32
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
