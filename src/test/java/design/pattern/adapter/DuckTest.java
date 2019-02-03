package design.pattern.adapter;

import org.junit.Test;

/**
 * @author cherbini
 * 2018/11/2 17:06
 */
public class DuckTest
{@Test
    public  void main()
    {
        MallardDuck duck = new MallardDuck();
        WildTurkey turkey = new WildTurkey();
        Duck turketAdapter = new TurkeyAdapter(turkey);
        System.out.println("turkey");
        turkey.gobble();

        turkey.fly();
        System.out.println("duck");
        duck.fly();
        duck.quack();
        System.out.println("Adapter");
        turketAdapter.fly();
        turketAdapter.quack();
    }

}