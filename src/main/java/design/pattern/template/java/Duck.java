package design.pattern.template.java;

/**
 * @author cherbini
 * 2018/11/5 17:16
 */
public class Duck implements Comparable
{
    String name;
    int weight;

    public Duck(String name, int weight)
    {
        this.name = name;
        this.weight = weight;

    }

    @Override
    public int compareTo(Object o)
    {
        Duck duck = (Duck) o;
        if (this.weight < duck.weight) return -1;
        else if (this.weight == duck.weight) return 0;
        else return 1;

    }

    @Override
    public String toString()
    {
        return "Duck{" + "name='" + name + '\'' + ", weight=" + weight + '}';
    }
}
