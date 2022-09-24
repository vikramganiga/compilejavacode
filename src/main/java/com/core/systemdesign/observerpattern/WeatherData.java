package com.core.systemdesign.observerpattern;

import java.util.ArrayList;

public class WeatherData implements Subject{

    private ArrayList<Observer> observers;
    private float temperature =0;
    private float humidity =0;
    private float pressure =0;

    public WeatherData(){
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);        
    }

    @Override
    public void removeObserver(Observer o) {
        int i= observers.indexOf(o);
        if(i >0)
            observers.remove(o);        
    }

    @Override
    public void notifyObserver() {
        for(int i=0; i < observers.size();i++){
            Observer observer = observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.humidity = humidity;
        this.temperature = temperature;
        this.pressure = pressure;
        notifyObserver();
    }

    public void measurementsChanged(){
        notifyObserver();
    }

}