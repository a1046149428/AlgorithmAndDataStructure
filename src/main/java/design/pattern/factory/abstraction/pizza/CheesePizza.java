package design.pattern.factory.abstraction.pizza;

import design.pattern.factory.abstraction.Pizza;
import design.pattern.factory.abstraction.PizzaIngredientFactory;

/**
 * @author cherbini
 * 2018/10/30 15:57
 */
public class CheesePizza extends Pizza
{
    PizzaIngredientFactory factory;

    public CheesePizza(PizzaIngredientFactory factory)
    {
        this.factory=factory;
    }

    @Override
    protected void prepare()
    {
        System.out.println("preparing "+name);
        dough=factory.createDough();
        cheese=factory.createCheese();
        sauce=factory.createSauce();
    }
}
