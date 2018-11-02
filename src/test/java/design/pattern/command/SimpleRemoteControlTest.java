package design.pattern.command;

import org.junit.Test;

/**
 * @author cherbini
 * 2018/10/31 17:53
 */
public class SimpleRemoteControlTest
{
    @Test
    public void test()
    {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light("living room");
        LightOnCommand lightOn = new LightOnCommand(light);
        remote.setCommand(lightOn);
        remote.buttonWasPressed();
    }


}