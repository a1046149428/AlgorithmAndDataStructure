package design.pattern.singleton;

/**
 * 私有内部类懒汉模式
 *
 * 优势：
 * 兼顾了懒汉模式的内存优化（使用时才初始化）以及饿汉模式的安全性（不会被反射入侵）。
 * 劣势：
 * 需要两个类去做到这一点，虽然不会创建静态内部类的对象，但是其 Class 对象还是会被创建，
 * 而且是属于永久带的对象。
 * 创建的单例，一旦在后期被销毁，不能重新创建。
 * @author cherbini
 * 2018/10/31 11:39
 */
public class InnerClassSingleton
{
    private static class Inner
    {
        private static InnerClassSingleton singleton = new InnerClassSingleton();
    }

    private InnerClassSingleton()
    {
        if (Inner.singleton != null)
        {
            throw new IllegalStateException();
        }
    }

    public static InnerClassSingleton getInstance()
    {
        return Inner.singleton;
    }
}
