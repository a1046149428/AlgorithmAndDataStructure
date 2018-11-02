package design.pattern.adapter.java;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * @author cherbini
 * 2018/11/2 17:45
 */
public class EnumerationIterator implements Iterator
{
    Enumeration enumeration;


    public EnumerationIterator(Enumeration enumeration)
    {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext()
    {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next()
    {
        return enumeration.nextElement();
    }

    @Override
    public void remove()
    {
throw new UnsupportedOperationException();
    }
}
