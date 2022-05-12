package com.company;

public class Main {

    public static void main(String[] args) {
        MeteoStation ms = new MeteoStation();
        ms.setMeasurements(15, 6, 10);

        Subscriber subscriber1 = new Subscriber("Подписчик 1");
        Subscriber subscriber2 = new Subscriber("Подписчик 2");

        ms.addObserver(subscriber1);
        ms.addObserver(subscriber2);

        ms.setMeasurements(20,8,35);

    }
}
