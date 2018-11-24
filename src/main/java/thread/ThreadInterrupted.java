package thread;

/**
 * @author cherbini
 * 2018/11/15 14:40
 */
public class ThreadInterrupted
{
    public static void main(String[] args) throws InterruptedException
    {
        Runnable r = () ->
        {
            String name = Thread.currentThread().getName();
            int count = 0;
            while (!Thread.interrupted()) System.out.println(name + ": " + count++);
        };
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        t1.start();
        t2.start();
        Thread.currentThread().sleep(100);
        t1.interrupt();
        t2.interrupt();
    }
}
