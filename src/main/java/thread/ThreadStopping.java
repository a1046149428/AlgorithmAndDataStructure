package thread;

/**
 * 尝试停止线程
 *
 * @author cherbini
 * 2018/11/17 17:29
 */
public class ThreadStopping
{
    public static void main(String[] args)
    {
        class StoppableThread extends Thread
        {
            private boolean stoped;

            @Override
            public void run()
            {
                while (!stoped)
                {
                    System.out.println("runnling");
                }
            }

            void setStoped()
            {
                stoped = true;
            }
        }
        StoppableThread thread = new StoppableThread();
        thread.start();
        try
        {
            Thread.sleep(1000);
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        thread.setStoped();
    }
}
