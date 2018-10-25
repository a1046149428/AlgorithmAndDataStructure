package designpattern.decorator;

/**
 * @author cherbini
 * 2018/10/25 15:11
 */
public abstract class Beverage
{
     String description = "Unknown Beverage";

    public String getDescription()
    {
        return description;
    }

    public abstract double cost();

}
