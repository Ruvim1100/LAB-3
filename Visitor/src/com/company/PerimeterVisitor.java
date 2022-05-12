package com.company;

public class PerimeterVisitor implements Visitor {
    @Override
    public void visit(Square square) {
        System.out.println("\nПериметр квадрата = " + square.side*4);
    }

    @Override
    public void visit(Rectangle rectangle) {
        System.out.println("\nПериметр прямоугольника = " + (rectangle.height+rectangle.width)*2);
    }

}
