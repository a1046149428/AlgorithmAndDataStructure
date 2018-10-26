package designpattern.factory;

/**
 * 简单工厂
 *
 * @author cherbini
 * 2018/10/26 10:07
 */
public class SimplePizzaFactory
{
    public Pizza createPizza(String type)
    {
        Pizza pizza = null;
        if ("cheese".equals(type))
        {
            pizza = new CheesePizza();
        }
        else if ("pepperoni".equals(type))
        {
            pizza = new PepperoniPizza();
        }
        else if ("clam".equals(type))
        {
            pizza = new ClamPizza();
        }
        else if ("veggie".equals(type))
        {
            pizza = new VeggiePizza();

        }
        return pizza;
    }
}
