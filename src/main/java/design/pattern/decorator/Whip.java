package design.pattern.decorator;

/**
 * @author cherbini
 * 2018/10/25 15:46
 */
public class Whip extends CondimentDecorator
{
    private  Beverage beverage;
    public Whip(Beverage beverage){
        this.beverage=beverage;
    }
    @Override
    public String getDescription()
    {
        return beverage.getDescription()+" Whip";
    }

    @Override
    public double cost()
    {
        return this.beverage.cost()+0.22;
    }
}
