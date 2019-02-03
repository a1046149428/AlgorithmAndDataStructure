package design.pattern.command;

/**
 * @author cherbini
 * 2018/11/1 17:20
 */
public class RemoteControlWithUndo
{
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteControlWithUndo()
    {
        offCommands = new Command[7];
        onCommands = new Command[7];
        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++)
        {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }
    public void setCommand(int slot, Command onCommand, Command offCommand)
    {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot)
    {
        onCommands[slot].execute();
        undoCommand=onCommands[slot];
    }

    public void offButtonWasPushed(int slot)
    {
        offCommands[slot].execute();
        undoCommand=offCommands[slot];
    }
    public void undoButtonWasPushed(){
        undoCommand.undo();
    }

}
