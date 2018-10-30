package design.pattern.factory.abstraction;

import design.pattern.factory.abstraction.ingredient.Cheese;
import design.pattern.factory.abstraction.ingredient.Clams;
import design.pattern.factory.abstraction.ingredient.Dough;
import design.pattern.factory.abstraction.ingredient.Sauce;
import design.pattern.factory.abstraction.ingredient.Veggies;

/**
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
