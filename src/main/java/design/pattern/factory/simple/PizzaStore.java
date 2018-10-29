package design.pattern.factory.simple;

import design.pattern.factory.Pizza;

/**
 * @author cherbini
 * 2018/10/29 11:26
 */
public class PizzaStore
{
    SimplePizzaFactory factory;
    public PizzaStore(SimplePizzaFactory factory){
        this.factory=factory;
    }
    public Pizza orderPizza(String type){
        Pizza pizza=factory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
