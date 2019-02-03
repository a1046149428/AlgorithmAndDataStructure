package design.pattern.factory;

import java.util.ArrayList;

/**
 * @author cherbini
 * 2018/10/29 11:21
 */
public abstract class Pizza
{
    protected String name;
    protected String dough;
    protected String sauce;
    protected ArrayList toppings = new ArrayList();

    public void prepare()
    {
        System.out.println("prepare..");
    }



    public void bake()
    {
        System.out.println("bake for 25 min");
    }



    public void cut()
    {
        System.out.println("cutting");
    }



    public void box()
    {
        System.out.println("i am boxing the pizza");
    }


}
