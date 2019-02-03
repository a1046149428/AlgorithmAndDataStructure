package design.pattern.singleton;

/**
 * 饿汉模式,缺点在于这个实例将永久保存在服务中,直到服务死亡.
 * 缺点:占用系统内存.
 * @author cherbini
 * 2018/10/31 10:32
 */
public class HungerSingleton
{
    private static HungerSingleton singleton = new HungerSingleton();

    private HungerSingleton()
    {
    }

    public static HungerSingleton getInstance()
    {
        return singleton;
    }
}
