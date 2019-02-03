package design.pattern.factory.method;

import design.pattern.factory.Pizza;
import org.junit.Test;

/**
 * @author cherbini
 * 2018/10/29 15:18
 */
public class PizzaStoreTest
{
    @Test
    public void method(){
        PizzaStore nyStore=new NYStylePizzaStore();
        assert nyStore.orderPizza("clam") instanceof Pizza;
        PizzaStore chicagoStore =new ChicagoStylePizzaStore();
        assert chicagoStore.orderPizza("cheese") instanceof  Pizza;
    }

}