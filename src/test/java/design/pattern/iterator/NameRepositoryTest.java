package design.pattern.iterator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author cherbini
 * 2018/11/6 23:15
 */
public class NameRepositoryTest
{
    @Test
    public void testIterator()
    {
        NameRepository names = new NameRepository();
        Iterator iterator = names.getIterator();
        while (iterator.hasNext())
        {
            System.out.println((String) iterator.next());
        }
    }

}