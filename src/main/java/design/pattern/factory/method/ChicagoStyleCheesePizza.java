package design.pattern.factory.method;

import design.pattern.factory.Pizza;

/**
 * @author cherbini
 * 2018/10/29 14:48
 */
public class ChicagoStyleCheesePizza extends Pizza
{
    public ChicagoStyleCheesePizza()
    {
        this.name = "Chicago cheese Pizza";
    }

    @Override
    public void prepare()
    {
        System.out.println("ChicagoStyleCheesePizza");
    }


    @Override
    public void box()
    {
        System.out.println("boxing Chicago!");
    }
}
