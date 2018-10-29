package design.pattern.decorator;

/**
 * @author cherbini
 * 2018/10/25 15:33
 */
public class Mocha extends CondimentDecorator
{
    private Beverage beverage;

    public Mocha(Beverage beverage)
    {
        this.beverage = beverage;
    }

    @Override
    public String getDescription()
    {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost()
    {
        return .20 + beverage.cost();
    }
}
