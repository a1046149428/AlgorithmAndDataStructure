package designpattern.observerpattern.javaversion;

import designpattern.observerpattern.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * @author cherbini
 * 2018/10/24 15:59
 */
public class CurrentConditionDisplay implements Observer, DisplayElement
{
    private Observable observable;
    private float temperature;
    private float humidity;


    public CurrentConditionDisplay(Observable observable)
    {
        this.observable = observable;
        observable.addObserver(this::update);
    }

    @Override
    public void update(Observable o, Object arg)
    {
        if (o instanceof WeatherData)
        {
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemprature();
            this.humidity = weatherData.getHumidity();
            this.display();
        }

    }

    @Override
    public void display()
    {
        System.out.println("temperature: "+temperature+"F degree "+humidity+"% humidity");
    }
}
