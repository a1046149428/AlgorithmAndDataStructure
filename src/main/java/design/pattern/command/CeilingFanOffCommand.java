package design.pattern.command;

/**
 * @author cherbini
 * 2018/11/2 10:40
 */
public class CeilingFanOffCommand implements Command
{
    CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanOffCommand(CeilingFan ceilingFan)
    {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute()
    {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.off();
    }

    @Override
    public void undo()
    {
        System.out.println("undo"+prevSpeed);
        ceilingFan.speed = prevSpeed;

    }
}
