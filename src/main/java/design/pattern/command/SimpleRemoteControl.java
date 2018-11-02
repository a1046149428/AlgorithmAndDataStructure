package design.pattern.command;

/**
 * @author cherbini
 * 2018/10/31 17:07
 */
public class SimpleRemoteControl
{
    Command slot;

    public SimpleRemoteControl()
    {
    }

    public void setCommand(Command command)
    {
        slot = command;
    }

    public void buttonWasPressed()
    {
        slot.execute();
    }
}
