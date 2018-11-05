package design.pattern.template.java;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author cherbini
 * 2018/11/5 17:26
 */
public class DuckTest
{
    @Test
    public void duckTest()
    {
        Duck[] ducks = new Duck[10];
        for (int i = 0; i < 10; i++)
        {
            ducks[i] = new Duck("duck" + i, (int) (Math.random() * 20));
        }
        for (Duck duck : ducks)
        {
            System.out.println(duck.toString());
        }
        System.out.printf("-------------------------------------------\n");
        Arrays.sort(ducks);
        for (Duck duck : ducks)
        {
            System.out.println(duck.toString());
        }
    }

}