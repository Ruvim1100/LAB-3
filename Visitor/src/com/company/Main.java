package com.company;

public class Main {

    public static void main(String[] args) {
        Square square = new Square(5);
        Rectangle rectangle = new Rectangle(4,8);

        PerimeterVisitor perimeterVisitor = new PerimeterVisitor();
        AreaVisitor areaVisitor = new AreaVisitor();

        square.accept(perimeterVisitor);
        rectangle.accept(areaVisitor);

    }
}
