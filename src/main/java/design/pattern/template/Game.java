package design.pattern.template;

/**
 * 模板方法模式,定义一个算法框架,并且实现一些公共的方法,不同的地方则有子类进行实现
 * java中采用此模式的有Arrays.sort()以及IO中的read()
 * 优点： 1、封装不变部分，扩展可变部分。 2、提取公共代码，便于维护。 3、行为由父类控制，子类实现。
 * 缺点：每一个不同的实现都需要一个子类来实现，导致类的个数增加，使得系统更加庞大。
 * 使用场景： 1、有多个子类共有的方法，且逻辑相同。 2、重要的、复杂的方法，可以考虑作为模板方法。
 * 注意事项：为防止恶意操作，一般模板方法都加上 final 关键词。
 *
 * @author cherbini
 * 2018/11/5 15:48
 */
public abstract class Game
{
    protected abstract void init();

    protected abstract void start();

    protected abstract void end();

    //模板
    public final void play()
    {
        init();
        start();
        end();
        destroy();
    }

    protected void destroy()
    {
        System.out.println("销毁所占用的资源!也可以作为钩子!");
    }

}
