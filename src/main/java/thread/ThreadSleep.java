package thread;

/**
 * @author cherbini
 * 2018/11/16 15:11
 */
public class ThreadSleep
{

    public static void main(String[] args)
    {
        Runnable r = () ->
        {
            String name = Thread.currentThread().getName();
            int count = 0;
            while (!Thread.interrupted()) System.out.println(name + ":" + count++);
        };

        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        t1.start();
        t2.start();
        try
        {
            Thread.sleep(2000);
        } catch (InterruptedException e)
        {

        }
        t1.interrupt();
        t2.interrupt();
    }

}
