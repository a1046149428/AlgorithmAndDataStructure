package designpattern.strategy;

/**
 * 策略模式
 *
 * @author cherbini
 * 2018/10/23 16:41
 */

/**
 * 通过使用多态,以改变策略
 */
public class Context
{
    private Strategy strategy;

    public Context(Strategy strategy)
    {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2)
    {
        return strategy.doOperation(num1, num2);
    }
}
