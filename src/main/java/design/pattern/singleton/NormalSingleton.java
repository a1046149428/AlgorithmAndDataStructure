package design.pattern.singleton;

/**
 * 普通懒汉模式,存在并发问题
 * 私有构造方法,静态方法,静态变量
 * @author cherbini
 * 2018/10/31 9:41
 */
public class NormalSingleton
{
    private static NormalSingleton singleton;

    private NormalSingleton()
    {
    }

    public static NormalSingleton getInstance()
    {
        if (singleton != null)
        {
            return singleton;
        }
        else
        {
            return new NormalSingleton();
        }
    }
}
