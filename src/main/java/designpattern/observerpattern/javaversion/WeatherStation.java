package designpattern.observerpattern.javaversion;

/**
 * @author cherbini
 * 2018/10/24 16:31
 */
public class WeatherStation
{
    public static void main(String[] args)
    {
        WeatherData o=new WeatherData();
        StatisticsDisplay s=new StatisticsDisplay(o);
        CurrentConditionDisplay c=new CurrentConditionDisplay(o);
        o.setMeasurements(80,20,30);
        o.setMeasurements(81,21,21);
        o.setMeasurements(68,19,45);
    }
}
