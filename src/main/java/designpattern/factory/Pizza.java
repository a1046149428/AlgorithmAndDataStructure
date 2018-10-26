package designpattern.factory;

import java.util.ArrayList;

/**
 * @author cherbini
 * 2018/10/26 10:08
 */
public class Pizza
{
    @Override
    public String toString()
    {
        return "Pizza{" + "name='" + name + '\'' + ", dough='" + dough + '\'' + ", sauce='" + sauce + '\'' + ", topping=" + topping + '}';
    }

    protected String name;
    protected String dough;
    protected String sauce;
    ArrayList topping = new ArrayList();

    public void prepare()
    {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding toppings:");
        topping.forEach(topping ->
        {
            System.out.println(" " + topping);
        });
    }

    public void bake()
    {
        System.out.println("baking,it will soon be baked");
    }

    public void cut()
    {
        System.out.println("cutting pizza,it will be eat soon");
    }

    public void box()
    {
        System.out.println("hhhh,boxing!!!");
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
