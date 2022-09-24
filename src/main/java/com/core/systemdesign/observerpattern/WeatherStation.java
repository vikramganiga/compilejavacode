package com.core.systemdesign.observerpattern;

public class WeatherStation{

    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay display = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(10, 20, 30);
        weatherData.setMeasurements(13, 21, 30);
    }

}