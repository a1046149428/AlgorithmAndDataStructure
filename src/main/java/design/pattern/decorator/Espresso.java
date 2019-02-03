package design.pattern.decorator;

/**
 * @author cherbini
 * 2018/10/25 15:14
 */
public class Espresso extends Beverage
{
    public Espresso(){
        description="Espresso";
    }
    @Override
    public double cost()
    {
        return 1.99;
    }
}
