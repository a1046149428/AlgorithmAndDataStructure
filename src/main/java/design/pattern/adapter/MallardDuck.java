package design.pattern.adapter;

/**
 * @author cherbini
 * 2018/11/2 15:54
 */
public class MallardDuck implements Duck
{
    @Override
    public void quack()
    {
        System.out.println("quack!");
    }

    @Override
    public void fly()
    {
        System.out.println("fly to anyway!!!");
    }
}
