package design.pattern.adapter;

/**
 * @author cherbini
 * 2018/11/2 16:56
 */
public class WildTurkey implements Turkey
{
    @Override
    public void gobble()
    {
        System.out.println(
                "gobble gobble!!!"
        );
    }

    @Override
    public void fly()
    {
        System.out.println("i'm flying a short distance!!!");
    }
}
