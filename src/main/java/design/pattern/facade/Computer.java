package design.pattern.facade;

/**
 * 这个外观模式相对比较简单,简化子系统的调用复杂度(隐藏系统复杂度)
 * 并且可以让子系统和客户端解耦合
 * 当完成一个业务需要多个子系统配合操作时,可以使用该设计模式
 * 通过创建外观类,使之含有各个子系统组件,创建外观方法,基本一个外观方法就是一个业务
 * 可以完成子系统各个组件一系列的操作,该方法委托子系统各个组件的方法方法进行操作.
 * 优点： 1、减少系统相互依赖。 2、提高灵活性。 3、提高了安全性。
 * <p>
 * 缺点：不符合开闭原则，如果要改东西很麻烦，继承重写都不合适。
 * <p>
 * 使用场景： 1、为复杂的模块或子系统提供外界访问的模块。 2、子系统相对独立。 3、预防低水平人员带来的风险。
 * <p>
 * 注意事项：在层次化结构中，可以使用外观模式定义系统中每一层的入口。
 *
 * @author cherbini
 * 2018/11/5 10:04
 */
public class Computer
{
    private CPU cpu;
    private Disk disk;
    private Memory memory;

    public void startUp()
    {
        cpu.startUp();
        memory.startUp();
        disk.startUp();

    }

    public void shutdown()
    {
        disk.shutdown();
        memory.shutdown();
        cpu.shutdown();
    }

    public CPU getCpu()
    {
        return cpu;
    }

    public void setCpu(CPU cpu)
    {
        this.cpu = cpu;
    }

    public Disk getDisk()
    {
        return disk;
    }

    public void setDisk(Disk disk)
    {
        this.disk = disk;
    }

    public Memory getMemory()
    {
        return memory;
    }

    public void setMemory(Memory memory)
    {
        this.memory = memory;
    }
}
