package design.pattern.factory.simple;

import design.pattern.factory.Pizza;

/**
 * 简单工厂类,通过类方法,把实例化部分抽出放置工厂类内.称不是上是设计模式,
 * 写多了你就会这样做了.
 * @author cherbini
 * 2018/10/29 11:20
 */
public class SimplePizzaFactory
{
    public Pizza createPizza(String type){
        Pizza pizza=null;
        if (type.equals("cheese")){
            pizza=new CheesePizza();
        }
        else if (type.equals("clam")){
            pizza=new ClamPizza();
        }
        return pizza;
    }
}
