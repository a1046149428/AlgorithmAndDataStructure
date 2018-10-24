package designpattern.observerpattern;

import java.util.ArrayList;

/**
 * @author cherbini
 * 2018/10/23 17:32
 */
public class WeatherData implements Subject
{
    // 观察者列表
    private ArrayList<Observer> observers;
    // 温度
    private float temprature;
    // 湿度
    private float humidity;
    // 压强
    private float pressure;

    public WeatherData()
    {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o)
    {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o)
    {
        int i = observers.indexOf(o);
        if (i >= 0) observers.remove(i);
    }

    @Override
    public void notifyObserver()
    {
        observers.forEach(observer -> observer.update(temprature, humidity, pressure));

    }

    public void measurementsChanged()
    {
        notifyObserver();
    }

    public void setMeasurements(float temprature, float humidity, float pressure)
    {
        this.humidity = humidity;
        this.pressure = pressure;
        this.temprature = temprature;
        measurementsChanged();
    }
}
