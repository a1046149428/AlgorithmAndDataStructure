package design.pattern.state;

/**
 * @author cherbini
 * 2018/11/7 20:44
 */
public interface State
{
    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    void dispense();
}
