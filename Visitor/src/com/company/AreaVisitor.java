package com.company;

public class AreaVisitor implements Visitor {
    @Override
    public void visit(Square square) {
        System.out.println("\nПлощадь квадрата = " + square.side * square.side);
    }

    @Override
    public void visit(Rectangle rectangle) {
        System.out.println("Площадь прямоугольника = " + rectangle.width * rectangle.height);
    }


}
