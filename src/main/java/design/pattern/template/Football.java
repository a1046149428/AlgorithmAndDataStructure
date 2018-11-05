package design.pattern.template;

/**
 * @author cherbini
 * 2018/11/5 15:55
 */
public class Football extends Game
{
    @Override
    protected void init()
    {
        System.out.println("football is initing!!");
    }

    @Override
    protected void start()
    {
        System.out.println("football is begin");

    }

    @Override
    protected void end()
    {
        System.out.println("football is end");

    }
}
