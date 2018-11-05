package design.pattern.template;

import java.util.Arrays;

/**
 * @author cherbini
 * 2018/11/5 15:57
 */
public class Basketball extends Game

{
    @Override
    protected void init()
    {
        System.out.println("basketball is initing!");
    }

    @Override
    protected void start()
    {
        System.out.println("basketball is begin!");
    }

    @Override
    protected void end()
    {
        System.out.println("basketball was ended!");

    }

    @Override
    protected void destroy()
    {
        System.out.println("销毁篮球资源!!!");

    }
}
