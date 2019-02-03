package interview;

import java.util.Arrays;

/**
 * 多线程交替执行
 *
 * @author cherbini
 * 2018/11/15 14:14
 */
public class ThreadTest extends Thread
{
    static Object LOCK = new Object();
    static char[] chars = new char[26];
    static int[] ints = new int[26];
    static volatile boolean flag = false;
    static volatile int num = 0;

    public static void main(String[] args)
    {
        for (int i = 0; i < 26; i++)
        {
            chars[i] = (char) (97 + i);
            ints[i] = i + 1;
        }
        System.out.println(Arrays.toString(chars));
        System.out.println(Arrays.toString(ints));
        ThreadTest t = new ThreadTest();
        ThreadTest t2 = new ThreadTest();
        ThreadTest t3 = new ThreadTest();
        ThreadTest t4 = new ThreadTest();
        ThreadTest t5 = new ThreadTest();
        t.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }

    @Override
    public void run()
    {

        while (num < 26)
        {
            synchronized (LOCK)
            {
                if (num < 26)
                {
                    if (!flag)
                    {
                        System.out.print(Thread.currentThread().getName() + "  ");
                        System.out.print(chars[num]);
                        flag = !flag;
                    }
                    else
                    {
                        System.out.print(Thread.currentThread().getName() + "  ");
                        System.out.println(ints[num]);
                        flag = !flag;
                        num++;
                    }
                }
            }

        }
    }
}
