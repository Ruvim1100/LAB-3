package com.company;

public class Square implements Shape{
    int side;
    public Square(int side){
        this.side = side;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

}
