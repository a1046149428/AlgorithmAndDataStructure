package designpattern.factory;

/**
 * @author cherbini
 * 2018/10/26 14:46
 */
public class ChicagoStyleCheesePizza extends Pizza
{
    public ChicagoStyleCheesePizza(){
        name="Chicago Style Deep dish cheese Pizza";
        dough="Extra Thick Crust Dough";
        sauce="Plum Tomato Sauce";
        topping.add("Cutting the pizza into square slicss");
    }
    @Override
    public void  cut(){
        System.out.println("cutting  the pizaa into square slices");
    }

}
