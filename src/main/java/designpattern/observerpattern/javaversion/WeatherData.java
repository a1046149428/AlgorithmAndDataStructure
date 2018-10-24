package designpattern.observerpattern.javaversion;

import java.util.Observable;

/**
 * @author cherbini
 * 2018/10/24 15:39
 */
public class WeatherData extends Observable
{   // 温度
    private float temprature;
    // 湿度
    private float humidity;
    // 压强
    private float pressure;

    public float getTemprature()
    {
        return temprature;
    }

    public float getHumidity()
    {
        return humidity;
    }

    public float getPressure()
    {
        return pressure;
    }


    public WeatherData()
    {
    }

    public void measurementChanged()
    {
        setChanged();
        notifyObservers(null);
    }

    public void setMeasurements(float temprature, float humidity, float pressure)
    {
        this.temprature = temprature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }

}