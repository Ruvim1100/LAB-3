package com.company;

public class Context {
    Sorting strategy;

    void setStrategy(Sorting strategy){
        this.strategy = strategy;
    }

    void executeStrategy(int[] mas) {
        strategy.sort(mas);
    }

}
