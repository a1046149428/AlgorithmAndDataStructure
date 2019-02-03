package design.pattern.factory.method;

import design.pattern.factory.Pizza;

/**
 * @author cherbini
 * 2018/10/29 14:44
 */
public class NYStyleClamPizza extends Pizza
{
    public NYStyleClamPizza()
    {
        this.name = "NYStyleClamPizza";
    }

    @Override
    public void prepare()
    {
        System.out.println("NYStyleClamPizza");
    }


    @Override
    public void box()
    {
        System.out.println("boxing NewYork!");
    }
}
