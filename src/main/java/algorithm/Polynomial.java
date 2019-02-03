package algorithm;

/**
 * java给定多项式在给定x的值
 *
 * @author cherbini
 * 2018/11/20 14:27
 */
public class Polynomial
{
    /**
     * 多项式定义的直接翻译
     *
     * @param n 第n项
     * @param a 常数数组
     * @param x 给定x的值
     * @return 多项式的值
     */
    public double f(int n, double a[], double x)
    {
        double p = a[0];
        for (int i = 1; i <= n; i++)
        {
            p += (a[i] * Math.pow(x, i));
        }
        return p;
    }

    /**
     * 秦久韶算法，提取公因数
     *
     * @param n 第n项
     * @param a 常数数组
     * @param x 给定x的值
     * @return 多项式的值
     */
    public double bestF(int n, double a[], double x)
    {
        double p = a[n];
        for (int i = n; i > 0; i--)
        {
            p = a[i - 1] + x * p;
        }
        return p;
    }
}
