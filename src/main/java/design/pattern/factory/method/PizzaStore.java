package design.pattern.factory.method;

import design.pattern.factory.Pizza;

/**
 * 工厂方法主要是将制作不同类型的对象,交给了子类去决定.
 * 这是一个权力下放的典型表现,相对与简单工厂,该类扩展性更强
 * 但是子类过多的时候,维护成本依旧很大.
 * 通过不同的工厂生产不同产品系列,这里表现为纽约风味和芝加哥风味
 * 两种风味又有很多风味系列产品,如芝士等
 * 产品类和工厂类是平行的,产品是通过抽象继承,而工厂类也还是通过抽象继承,地位是平等的
 * 但是具体产品类却是有具体工厂类所生产,这里表现为具体的披萨店生产
 * 帮助避免违反依赖导致原的指导方针
 * 1.变量不可以持有具体类的引用
 * 2.不要让类派生自具体类
 * 3.不要覆盖基类已实现的方法
 *
 * @author cherbini
 * 2018/10/29 14:31
 */
public abstract class PizzaStore
{
    public Pizza orderPizza(String type)
    {
        Pizza pizza;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
