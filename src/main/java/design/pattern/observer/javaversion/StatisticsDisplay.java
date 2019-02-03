package design.pattern.observer.javaversion;

import design.pattern.observer.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * @author cherbini
 * 2018/10/24 16:11
 */
public class StatisticsDisplay implements Observer, DisplayElement
{
    private float minTemperature;
    private float maxTemperature;
    private float maxHumidity;
    private float minHumidity;
    private float maxPressure;
    private float minPressure;
    private Observable waetherData;

    public StatisticsDisplay(Observable waetherData)
    {
        this.waetherData = waetherData;
        waetherData.addObserver(this::update);
    }

    @Override
    public void display()
    {
        System.out.println("The max temperature is:" + maxTemperature + " F degree.");
        System.out.println("The min temperature is:" + minTemperature + " F degree.");
        System.out.println("The min humidity is:" + minHumidity + " %");
        System.out.println("The max humidity is:" + maxHumidity + " %");
        System.out.println("The max pressure is:" + maxPressure + " %");
        System.out.println("The min pressure is:" + minPressure + " %");
    }

    @Override
    public void update(Observable obs,Object o)
    {
        WeatherData weatherData=(WeatherData) obs;
        judgeHumidity(weatherData.getHumidity());
        judgePressure(weatherData.getPressure());
        judgeTemperature(weatherData.getTemprature());
        display();

    }

    private void judgeTemperature(float temp)
    {
        if (this.maxTemperature == 0.0f)
        {
            this.maxTemperature = temp;
        }
        else if (this.maxTemperature > temp && temp < this.minTemperature)
        {
            this.minTemperature = temp;
        }
        else if (this.maxTemperature < temp)
        {
            this.maxTemperature = temp;
        }
        else if (this.maxTemperature > temp && this.minTemperature == 0.0f)
        {
            minTemperature=temp;
        }

    }

    private void judgePressure(float pressure)
    {
        if (this.maxPressure == 0.0f)
        {
            this.maxPressure = pressure;
        }
        else if (this.maxPressure > pressure && pressure < this.minPressure)
        {
            this.minPressure = pressure;
        }
        else if (this.maxPressure < pressure)
        {
            this.maxPressure = pressure;
        }
        else if (this.maxPressure > pressure && this.minPressure == 0.0f)
        {
            minPressure=pressure;
        }

    }

    private void judgeHumidity(float humidity)
    {
        if (this.maxHumidity == 0.0f)
        {
            this.maxHumidity = humidity;

        }
        else if (this.maxHumidity > humidity && humidity < this.minPressure)
        {
            this.minHumidity = humidity;
        }
        else if (this.maxHumidity < humidity)
        {
            this.maxHumidity = humidity;
        }
        else if (this.maxHumidity > humidity && this.minHumidity == 0.0f)
        {
            minHumidity=humidity;
        }
    }
}
