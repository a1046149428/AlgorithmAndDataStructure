package design.pattern.factory.method;

import design.pattern.factory.Pizza;

/**
 * @author cherbini
 * 2018/10/29 14:36
 */
public class NYStylePizzaStore extends PizzaStore
{
    @Override
    protected Pizza createPizza(String type)
    {
        if (type.equals("cheese"))
        {
            return new NYStyleCheesePizza();
        }
        else
        {
            return new NYStyleClamPizza();
        }

    }
}
