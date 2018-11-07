package design.pattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cherbini
 * 2018/11/7 10:27
 */
public class Noder extends Node
{
    private List<Node> nodes = new ArrayList<>();

    public Noder(String name)
    {
        super(name);
    }

    @Override
    public void addNode(Node node)
    {
        nodes.add(node);
    }

    @Override
    void display()
    {
        System.out.println(name);
        for (Node node : nodes) node.display();
    }
}
