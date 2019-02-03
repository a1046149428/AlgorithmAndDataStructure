package design.pattern.strategy;

/**
 * @author cherbini
 * 2018/10/23 16:40
 */
public class OperationMultiply implements Strategy
{
    @Override
    public int doOperation(int num, int num2)
    {
        return  num*num2;
    }
}
