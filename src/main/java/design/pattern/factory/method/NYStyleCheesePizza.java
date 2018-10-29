package design.pattern.factory.method;

import design.pattern.factory.Pizza;

/**
 * 作为子类你可以任意修改相应的方法和属性,为自己服务
 *
 * @author cherbini
 * 2018/10/29 14:39
 */
public class NYStyleCheesePizza extends Pizza
{
    public NYStyleCheesePizza()
    {
        this.name = "new york cheese Pizza";
    }

    @Override
    public void prepare()
    {
        System.out.println("NYStyleCheesePizza");
    }


    @Override
    public void box()
    {
        System.out.println("boxing NewYork!");
    }
}
