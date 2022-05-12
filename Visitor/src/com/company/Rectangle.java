package com.company;

public class Rectangle implements Shape {
    int height;
    int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

}
