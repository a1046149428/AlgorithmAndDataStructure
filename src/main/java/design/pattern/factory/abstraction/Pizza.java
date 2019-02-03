package design.pattern.factory.abstraction;

import design.pattern.factory.abstraction.ingredient.Cheese;
import design.pattern.factory.abstraction.ingredient.Clams;
import design.pattern.factory.abstraction.ingredient.Dough;
import design.pattern.factory.abstraction.ingredient.Perperoni;
import design.pattern.factory.abstraction.ingredient.Sauce;
import design.pattern.factory.abstraction.ingredient.Veggies;

/**
 * @author cherbini
 * 2018/10/30 15:16
 */
public abstract class Pizza
{
    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Veggies[] veggies;
    protected Cheese cheese;
    protected Perperoni perperoni;
    protected Clams clams;

    protected abstract void prepare();

    protected void bake()
    {
        System.out.println("Bake for 25 minutes at 350");
    }

    protected void cut()
    {
        System.out.println("I'm cutting the pizza ");
    }

    protected void box()
    {
        System.out.println("place pizza in official  PizzaStore box");
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

    @Override
    public String toString()
    {
        return this.name + this.dough + this.sauce + this.veggies + this.cheese + this.clams;
    }

}
