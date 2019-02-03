package design.pattern.factory.abstraction;


import design.pattern.factory.abstraction.ingredient.Veggies;
import design.pattern.factory.abstraction.pizza.CheesePizza;
import design.pattern.factory.abstraction.pizza.ClamPizza;

/**
 * @author cherbini
 * 2018/10/30 16:45
 */
public class NYPizzaStore extends PizzaStore
{
    @Override
    protected Pizza createPizza(String type)
    {
        Pizza pizza = null;
        PizzaIngredientFactory factory = new NYPizzaIngredientFactory();
        if (type.equals("cheese"))
        {
            pizza = new CheesePizza(factory);
            pizza.setName("NY cheese pizza!!!");
        }
        else if (type.equals("clam"))
        {
            pizza = new ClamPizza(factory);
            pizza.setName("NY clam pizza!!!");
        }

        return pizza;
    }
}
