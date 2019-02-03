package design.pattern.singleton;

/**
 * 双重检查加锁机制
 * 通过检查第一次的单例,进而加锁.确保只有一个线程进行操作
 * 此后,不需要对代码加锁,完美解决并发问题.
 * 缺点:就是每次都要判断是否为空
 * @author cherbini
 * 2018/10/31 10:41
 */
public class DoubleCheckSingleton
{
    private volatile static DoubleCheckSingleton singleton;

    private DoubleCheckSingleton()
    {
    }

    public static DoubleCheckSingleton getInstance()
    {
        if (singleton == null)
        {
            synchronized (DoubleCheckSingleton.class)
            {
                if (singleton == null) singleton = new DoubleCheckSingleton();
            }
        }
        return singleton;
    }
}
