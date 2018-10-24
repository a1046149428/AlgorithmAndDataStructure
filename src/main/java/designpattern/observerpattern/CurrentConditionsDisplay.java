package designpattern.observerpattern;

/**
 * @author cherbini
 * 2018/10/23 17:57
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement
{
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData)
    {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display()
    {

    }

    @Override
    public void update(float temp, float humidity, float pressure)
    {

    }
}
