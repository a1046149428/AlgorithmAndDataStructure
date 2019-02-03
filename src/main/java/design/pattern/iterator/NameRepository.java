package design.pattern.iterator;

/**
 * @author cherbini
 * 2018/11/6 22:59
 */
public class NameRepository implements Container
{
    private String[] names = {"alice", "julie", "lora", "james"};

    @Override
    public Iterator getIterator()
    {
        return new NameIterator();
    }

    private class NameIterator implements Iterator
    {
        int index;

        @Override
        public boolean hasNext()
        {
            if (index < names.length) return true;
            return false;
        }

        @Override
        public Object next()
        {
            if (this.hasNext())
            {
                return names[index++];
            }
            return null;
        }
    }
}
