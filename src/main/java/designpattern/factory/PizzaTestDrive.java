package designpattern.factory;

/**
 * @author cherbini
 * 2018/10/26 15:14
 */
public class PizzaTestDrive
{
    public static void main(String[] args)
    {
        PizzaStore nystore= new NYStyleStore();
      Pizza p= nystore.createPizza("cheese");
        System.out.println(p.toString());
    }
}
