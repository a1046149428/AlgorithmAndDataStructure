package design.pattern.factory.abstraction;

import design.pattern.factory.abstraction.ingredient.Cheese;
import design.pattern.factory.abstraction.ingredient.Clams;
import design.pattern.factory.abstraction.ingredient.Dough;
import design.pattern.factory.abstraction.ingredient.Sauce;
import design.pattern.factory.abstraction.ingredient.Veggies;

/**
 * 抽象工厂定义工厂接口,由子类工厂去实现.
 * 通过产品类去持有工厂接口,来确保产品的生成方式
 * 利用多态,具体产品类不关注工厂类型,也就是可以被多种工厂所复用
 * 通过第三方(这里指的是披萨店)实例化具体工厂类传值,来生产具体的产品
 * 有几种工厂子类,就有几种产品族
 * 同时还不要忽略的原料族的功能
 * 通过抽象工厂,通过组合与多态,使得原料对象和产品对象以及工厂对象平行
 * 这三个抽象类都不关心你是谁,只需要实现了对应的接口就可以了
 * 在使用抽象工厂的时候,只要用对具体工厂子类即可
 * @author cherbini
 * 2018/10/30 14:33
 */
public interface PizzaIngredientFactory

{
    /**
     * 面团
     *
     * @return 面团
     */
    Dough createDough();

    /**
     * 酱
     *
     * @return 酱料
     */
    Sauce createSauce();

    /**
     * 芝士
     *
     * @return 芝士
     */

    Cheese createCheese();

    /**
     * 蔬菜调料
     *
     * @return 蔬菜
     */
    Veggies[] createVeggies();

    /**
     *  蛤
     * @return 蛤
     */
    Clams createClam();
}
