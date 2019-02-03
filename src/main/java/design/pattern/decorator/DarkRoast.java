package design.pattern.decorator;

/**
 * @author cherbini
 * 2018/10/25 15:21
 */
public class DarkRoast extends Beverage
{
    public DarkRoast(){
        description="DeepBaking";
    }
    @Override
    public double cost()
    {
        return .54;
    }
}
