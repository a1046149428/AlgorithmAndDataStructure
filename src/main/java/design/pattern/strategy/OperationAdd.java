package design.pattern.strategy;

/**
 * @author cherbini
 * 2018/10/23 10:20
 */
public class OperationAdd implements Strategy
{
    @Override
    public int doOperation(int num, int num2)
    {
        return num+num2;
    }
}
