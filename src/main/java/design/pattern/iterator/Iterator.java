package design.pattern.iterator;

/**
 * 这个是内置的迭代器模式，还有外置的迭代器模式
 * 看到ArrayList里面的优化版本迭代器是采用内置的
 * head first提倡外置的，有利于修改
 *
 * @author cherbini
 * 2018/11/6 21:17
 */
public interface Iterator<T>
{
    boolean hasNext();

    T next();
}
