package design.pattern.state;

/**
 * @author cherbini
 * 2018/11/7 20:47
 */
public class NoQuarterState implements State
{
    GumBallMachine gumBallMachine;

    public NoQuarterState(GumBallMachine gumBallMachine)
    {
        this.gumBallMachine = gumBallMachine;
    }

    @Override
    public void insertQuarter()
    {
        System.out.println("You inserted a quarter");
        gumBallMachine.setState(gumBallMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter()
    {
        System.out.println("You havaen't inserted a quarter!");
    }

    @Override
    public void turnCrank()
    {
        System.out.println("You turned, but there's no quarter");
    }

    @Override
    public void dispense()
    {
        System.out.println("You need to pay first ");
    }
}
