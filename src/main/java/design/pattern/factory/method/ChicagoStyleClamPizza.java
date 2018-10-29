package design.pattern.factory.method;

import design.pattern.factory.Pizza;

/**
 * @author cherbini
 * 2018/10/29 14:49
 */
public class ChicagoStyleClamPizza extends Pizza
{
    public ChicagoStyleClamPizza()
    {
        this.name = "Chicago clam Pizza";
    }

    @Override
    public void prepare()
    {
        System.out.println("ChicagoStyleClamPizza");
    }


    @Override
    public void box()
    {
        System.out.println("ChicagoStyleClamPizza");
    }
}
