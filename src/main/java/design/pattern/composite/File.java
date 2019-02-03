package design.pattern.composite;


/**
 * @author cherbini
 * 2018/11/7 10:25
 */
public class File extends Node
{
    public File(String name)
    {
        super(name);
    }

    @Override
    void display()
    {
        System.out.println(name);
    }
}
