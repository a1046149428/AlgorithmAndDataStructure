package designpattern.observerpattern;

/**
 * 观察者模式
 *
 * @author cherbini
 * 2018/10/23 17:22
 */
public interface Subject
{
    /**
     * 注册观察者
     *
     * @param o 观察者对象
     */
    void registerObserver(Observer o);

    /**
     * 删除观察者
     *
     * @param o 被删除的观察者对象
     */
    void removeObserver(Observer o);

    /**
     * 通知所有观察者
     */
    void notifyObserver();
}
