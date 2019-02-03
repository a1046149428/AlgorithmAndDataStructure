package design.pattern.template;

import org.junit.Test;

/**
 * @author cherbini
 * 2018/11/5 16:23
 */
public class GameTest
{
    @Test
    public void game()
    {
        Game football = new Football();
        Game basketball = new Basketball();
        football.play();
        basketball.play();
    }

}