package design.pattern.singleton;

/**
 * 加锁同步模式下的单例,解决并发问题,但是导致性能问题.
 * @author cherbini
 * 2018/10/31 10:20
 */
public class SynchronizedSingleton
{
    private static SynchronizedSingleton singleton;

    private SynchronizedSingleton()
    {
    }

    public static synchronized SynchronizedSingleton getInstance()
    {
        if (singleton != null) return singleton;
        else return new SynchronizedSingleton();
    }
}
