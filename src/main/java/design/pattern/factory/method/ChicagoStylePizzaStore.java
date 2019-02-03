package design.pattern.factory.method;

import design.pattern.factory.Pizza;

/**
 * @author cherbini
 * 2018/10/29 14:46
 */
public class ChicagoStylePizzaStore extends PizzaStore
{
    @Override
    protected Pizza createPizza(String type)
    {
        if (type.equals("cheese")){
            return new ChicagoStyleCheesePizza();
        }else {
            return new ChicagoStyleClamPizza();
        }
    }
}
