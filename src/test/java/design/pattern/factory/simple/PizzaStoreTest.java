package design.pattern.factory.simple;

import design.pattern.factory.Pizza;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author cherbini
 * 2018/10/29 15:12
 */
public class PizzaStoreTest
{
    @Test
    public void simple(){
       PizzaStore store=new PizzaStore(new SimplePizzaFactory());
       store.orderPizza("cheese");
    }

}