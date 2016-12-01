package ru.academits.dyachenko.shape;

import java.util.ArrayList;

import java.util.Collections;

public class ShapeMain {
    public static void main(String[] args) {
        ArrayList<Shape> aListShapes = new ArrayList<>();

        Square square1 = new Square("square1", 12);
        aListShapes.add(square1);

        Square square2 = new Square("square2", 2);
        aListShapes.add(square2);

        Square square3 = new Square("square3", 172);
        aListShapes.add(square3);

        Triangle triangle1 = new Triangle("triangle1", 1.0, 10.0, 20.1, 3.2, 4.8, 5.8);
        aListShapes.add(triangle1);

        Triangle triangle2 = new Triangle("triangle2", 23.1, 112.9, 3.1, 2.2, 21.1, 17.2);
        aListShapes.add(triangle2);

        Rectangle rectangle1 = new Rectangle("rectangle1", 1, 2);
        aListShapes.add(rectangle1);

        Rectangle rectangle2 = new Rectangle("rectangle2", 41, 25);
        aListShapes.add(rectangle2);

        Circle circle1 = new Circle("circle1", 1);
        aListShapes.add(circle1);

        Circle circle2 = new Circle("circle2", 54);
        aListShapes.add(circle2);

        Collections.sort(aListShapes, new SortedByAreaComparator());

        System.out.printf("Наибольшая фигура:%s с площадью %s%nВторая по величине фигура:%s с площадью %s%n", aListShapes.get(aListShapes.size() - 1).getName(), aListShapes.get(aListShapes.size() - 1).getArea(), aListShapes.get(aListShapes.size() - 2).getName(), aListShapes.get(aListShapes.size() - 2).getArea());

    }
}

