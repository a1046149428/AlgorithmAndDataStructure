package thread;

/**
 * 死锁的实现
 * 通过同步嵌套，两个线程都需要对方的那个锁，才能继续执行。
 * @author cherbini
 * 2018/11/17 17:06
 */
public class DeadLockDemo
{
    private final Object lock1 = new Object();
    private final Object lock2 = new Object();

    public void instanceMethod1()
    {
        synchronized (lock1)
        {
            synchronized (lock2)
            {
                System.out.println("first thread in instanceMethod1");
            }
        }
    }

    public void instanceMethod2()
    {
        synchronized (lock2)
        {
            synchronized (lock1)
            {
                System.out.println("second thread in insatanceMethond2");
            }
        }
    }

    public static void main(String[] args)
    {
        final DeadLockDemo dld = new DeadLockDemo();
        Runnable r1 = () ->
        {
            while (true)
            {
                dld.instanceMethod1();
                try
                {
                    Thread.sleep(50);
                } catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        };
        Thread t1 = new Thread(r1);
        Runnable r2 = () ->
        {

            while (true)
            {
                dld.instanceMethod2();
                try
                {
                    Thread.sleep(50);

                } catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        };
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
    }
}
