package designpattern.factory;

/**
 * @author cherbini
 * 2018/10/26 11:22
 */
public class NYStyleCheesePizza extends Pizza
{
    public NYStyleCheesePizza()
    {
        name = "NY Style sauce and Cheese Pizza";
        dough = "This Crust Dough";
        sauce = "Marinara Sauce";
        topping.add("Grated Reggiano Cheese");
    }
}
