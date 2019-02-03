package design.pattern.command;

/**
 * @author cherbini
 * 2018/11/1 11:35
 */
public class LightOffCommand implements Command
{
    Light light;

    public LightOffCommand(Light light)
    {
        this.light = light;
    }

    @Override
    public void execute()
    {
        light.off();

    }

    @Override
    public void undo()
    {
        light.on();
    }
}
