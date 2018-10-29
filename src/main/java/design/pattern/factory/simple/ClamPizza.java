package design.pattern.factory.simple;

import design.pattern.factory.Pizza;

/**
 * @author cherbini
 * 2018/10/29 11:25
 */
public class ClamPizza extends Pizza
{
    @Override
    public void prepare()
    {
        System.out.println("normal clam pizza");
    }

    @Override
    public void bake()
    {

    }

    @Override
    public void cut()
    {

    }

    @Override
    public void box()
    {

    }
}
