package design.pattern.command;

/**
 * @author cherbini
 * 2018/11/1 11:38
 */
public class StereOnWithCDCommand implements Command
{
    Stereo stereo;
    public StereOnWithCDCommand(Stereo stereo){
        this.stereo=stereo;
    }
    @Override
    public void execute()
    {
        stereo.on();

        stereo.setCD();
        stereo.setVolume(11);
    }

    @Override
    public void undo()
    {

    }
}
