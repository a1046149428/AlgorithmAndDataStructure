package designpattern.observer;

/**
 * @author cherbini
 * 2018/10/24 11:28
 */
public class ForecastDisplay implements Observer, DisplayElement
{
public ForecastDisplay (Subject o){
    o.registerObserver(this::update);
}
    @Override
    public void display()
    {
        System.out.println("there is no forecast!!!");
    }

    @Override
    public void update(float temp, float humidity, float pressure)
    {
        display();
    }
}
