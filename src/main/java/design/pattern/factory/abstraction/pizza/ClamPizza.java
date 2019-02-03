package design.pattern.factory.abstraction.pizza;

import design.pattern.factory.abstraction.Pizza;
import design.pattern.factory.abstraction.PizzaIngredientFactory;

/**
 * @author cherbini
 * 2018/10/30 16:41
 */
public class ClamPizza extends Pizza
{
    PizzaIngredientFactory factory;
    public  ClamPizza(PizzaIngredientFactory factory){
        this.factory=factory;
    }
    @Override
    protected void prepare()
    {
        System.out.println("prepare "+name);
        dough=factory.createDough();
        sauce=factory.createSauce();
        cheese=factory.createCheese();
        clams=factory.createClam();
    }
}
