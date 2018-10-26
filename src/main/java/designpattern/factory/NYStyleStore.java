package designpattern.factory;

/**
 * @author cherbini
 * 2018/10/26 10:53
 */
public class NYStyleStore extends PizzaStore
{

    @Override
    protected Pizza createPizza(String type)
    {

        if ("cheese".equals(type))
        {
            return new NYStyleCheesePizza();
        }
        else if ("pepperoni".equals(type))
        {
           return new NYStylePepperoniPizza();
        }
        else if ("clam".equals(type))
        {
            return new NYStyleClamPizza();
        }
        else if ("veggie".equals(type))
        {
           return new NYStyleVeggiePizza();

        }
        return null;
    }
}
