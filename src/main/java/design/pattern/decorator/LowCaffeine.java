package design.pattern.decorator;

/**
 * @author cherbini
 * 2018/10/25 15:23
 */
public class LowCaffeine extends Beverage
{
    public LowCaffeine(){
        description="LowCaffeine";
    }
    @Override
    public double cost()
    {
        return 1.02;
    }
}
