package designpattern.decorator;

/**
 * @author cherbini
 * 2018/10/25 15:50
 */
public class Soy extends CondimentDecorator
{
    private Beverage beverage;

    public Soy(Beverage beverage)
    {
        this.beverage = beverage;
    }
    @Override
    public String getDescription()
    {
        return beverage.getDescription()+" Soy";
    }

    @Override
    public double cost()
    {
        return this.beverage.cost()+0.22;
    }
}
