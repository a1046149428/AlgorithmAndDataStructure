package design.pattern.adapter;

/**
 * @author cherbini
 * 2018/11/2 17:00
 */
public class TurkeyAdapter implements Duck
{
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey)
    {
        this.turkey = turkey;
    }

    @Override
    public void quack()
    {
        turkey.gobble();

    }

    @Override
    public void fly()
    {
        turkey.fly();
    }
}
