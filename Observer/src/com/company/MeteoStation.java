package com.company;

import java.util.ArrayList;
import java.util.List;

public class MeteoStation implements Observed {
    int temperature;
    int windSpeed;
    int chanceOfRain;

    List<Observer> subscribers = new ArrayList<>();

    public void setMeasurements(int temp, int wind, int rain){
        this.temperature = temp;
        this.windSpeed = wind;
        this.chanceOfRain = rain;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: subscribers){
            observer.handleEvent(temperature, windSpeed, chanceOfRain);
        }
    }

}
