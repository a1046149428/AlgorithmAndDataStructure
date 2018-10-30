package design.pattern.factory.abstraction;

/**
 * @author cherbini
 * 2018/10/30 17:27
 */
public abstract class PizzaStore
{
    abstract Pizza createPizza(String type);

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
}
