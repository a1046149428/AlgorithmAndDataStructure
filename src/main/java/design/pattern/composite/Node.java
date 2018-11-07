package design.pattern.composite;

/**
 * @author cherbini
 * 2018/11/7 10:23
 */
public abstract class Node
{


    protected String name;

    public Node(String name)
    {
        this.name = name;
    }

    public void addNode(Node node) throws Exception
    {
        throw new Exception("can't do");
    }

    abstract void display();

    public String getName()
    {
        return name;
    }
}
