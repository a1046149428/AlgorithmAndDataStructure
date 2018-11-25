package interview;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author cherbini
 * 2018/11/25 1:32
 */
public class KayakWiseTest
{
    @Test
    public void test()
    {
        assert 59 == KayakWise.checkDayOfYear(2018, 2, 28);
        assert 90 == KayakWise.checkDayOfYear(2018, 3, 31);
    int [] a={1,23,23,1,3,4,5,3,3};
    KayakWise.printfRepeatValueAndPosition(a);
    }

}