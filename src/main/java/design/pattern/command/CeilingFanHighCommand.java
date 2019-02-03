package design.pattern.command;

/**
 * @author cherbini
 * 2018/11/2 9:59
 */
public class CeilingFanHighCommand implements Command
{
    CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanHighCommand(CeilingFan ceilingFan)
    {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute()
    {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.high();
    }

    @Override
    public void undo()
    {
        System.out.println("undo"+prevSpeed);
        ceilingFan.speed = prevSpeed;

    }
}
