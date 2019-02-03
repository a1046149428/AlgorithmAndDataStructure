package design.pattern.decorator;

/**
 * @author cherbini
 * 2018/10/25 15:19
 */
public class HouseBlend extends Beverage
{

public  HouseBlend(){
    description="HouseBlend";
}
    @Override
    public double cost()
    {
        return .89;
    }
}
