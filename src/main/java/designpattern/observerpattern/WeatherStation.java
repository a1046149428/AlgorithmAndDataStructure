package designpattern.observerpattern;

/**
 * @author cherbini
 * 2018/10/24 10:45
 */
public class WeatherStation
{
    public static void main(String[] args)
    {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        weatherData.setMeasurements(80,20,30);
        weatherData.setMeasurements(81,21,21);
        weatherData.setMeasurements(68,19,45);
    }
}
