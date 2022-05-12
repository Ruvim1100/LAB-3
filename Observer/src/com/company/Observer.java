package com.company;

public interface Observer {
    void handleEvent(int temperature, int windSpeed, int chanceOfRain);
}
