package com.company;

public class Subscriber implements Observer {
    String name;
    public Subscriber(String name){
        this.name = name;
    }

    @Override
    public void handleEvent(int temperature, int windSpeed, int chanceOfRain) {
        System.out.println("\n Уважаемый " + name + "! Погода изменилась.\nТемпература = " + temperature + " С\nСкорость ветра = " + windSpeed + " м/с\nВероятность дождя = " + chanceOfRain + "%\n==================" );
    }

}
