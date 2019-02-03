package design.pattern.command;

/**
 * @author cherbini
 * 2018/11/1 11:39
 */
public class Stereo
{
    private  String name;
    public Stereo(String name)
    {
        this.name=name;
    }

    public void setVolume(int i)
    {
        System.out.println(name+"设置声音到: " + i);
    }

    public void on()
    {
        System.out.println(name+".this stereo is on!");
    }

    public void setCD()
    {
        System.out.println(name +".Please listen to the moon to represent my heart!");
    }
}
