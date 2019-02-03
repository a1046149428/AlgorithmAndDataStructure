package design.pattern.command;

/**
 * @author cherbini
 * 2018/11/2 10:28
 */
public class CeilingFanLoader
{
    public static void main(String[] args)
    {
        RemoteControlWithUndo control = new RemoteControlWithUndo();
        CeilingFan fan = new CeilingFan("Living Room");
        CeilingFanHighCommand command = new CeilingFanHighCommand(fan);
        CeilingFanOffCommand offCommand = new CeilingFanOffCommand(fan);
        control.setCommand(0, command, offCommand);

        control.offButtonWasPushed(0);
        control.onButtonWasPushed(0);
        control.undoButtonWasPushed();
    }

}
