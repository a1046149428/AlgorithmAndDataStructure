package design.pattern.observer.javaversion;

import design.pattern.observer.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * @author cherbini
 * 2018/10/24 16:16
 */
public class ForecastDisplay implements Observer, DisplayElement
{
    @Override
    public void display()
    {
        System.out.println("there is no forecast now!please ");
    }

    @Override
    public void update(Observable o, Object arg)
    {
        display();

    }
}
