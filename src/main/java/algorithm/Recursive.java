package algorithm;

/**
 * @author cherbini
 * 2018/11/21 16:07
 */
public class Recursive
{
    public  static  int factorial(int n)
    {
        if (n > 1) return n * factorial(n - 1);
        return n;
    }

    public static void main(String[] args)
    {
        System.out.println(Recursive.factorial(5));
    }
}
