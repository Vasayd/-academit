package ru.academits.dyachenko.shape;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;


public class ShapeMain {
    public static void main(String[] args) {
        ArrayList<String> aListShapes = new ArrayList<>();

        Square square1 = new Square("square1", 12);
        aListShapes.add("Площадь: " + square1.getArea() + " Фигура: " + square1.getName());

        Square square2 = new Square("square2", 2);
        aListShapes.add("Площадь: " + square2.getArea() + " Фигура: " + square2.getName());

        Square square3 = new Square("square3", 172);
        aListShapes.add("Площадь: " + square3.getArea() + " Фигура: " + square3.getName());

        Triangle triangle1 = new Triangle("triangle1", 1.0, 10.0, 20.1, 3.2, 4.8, 5.8);
        aListShapes.add("Площадь: " + triangle1.getArea() + " Фигура: " + triangle1.getName());

        Triangle triangle2 = new Triangle("triangle2", 23.1, 112.9, 3.1, 2.2, 21.1, 17.2);
        aListShapes.add("Площадь: " + triangle2.getArea() + " Фигура: " + triangle2.getName());

        Rectangle rectangle1 = new Rectangle("rectangle1", 1, 2);
        aListShapes.add("Площадь: " + rectangle1.getArea() + " Фигура: " + rectangle1.getName());

        Rectangle rectangle2 = new Rectangle("rectangle2", 41, 25);
        aListShapes.add("Площадь: " + rectangle2.getArea() + " Фигура: " + rectangle2.getName());

        Circle circle1 = new Circle("cercle1", 1);
        aListShapes.add("Площадь: " + circle1.getArea() + " Фигура: " + circle1.getName());

        Circle circle2 = new Circle("cercle2", 54);
        aListShapes.add("Площадь: " + circle2.getArea() + " Фигура: " + circle2.getName());


        String[] array1 = new String[]{square1.getArea() + square1.getName(), square2.getArea() + square2.getName(), square3.getArea() + square3.getName(), triangle1.getArea() + triangle1.getName(),
                triangle2.getArea() + triangle2.getName(), rectangle1.getArea() + rectangle1.getName(), rectangle2.getArea() + rectangle2.getName(), circle1.getArea() + circle1.getName(), circle2.getArea() + circle2.getName()};

        // System.out.println(Arrays.toString(array1));
        // Arrays.sort(array1); // add new comparator


        Collections.sort(aListShapes/* new SortedByAreaComparator()*/);


        System.out.println(Arrays.toString(array1));

        System.out.println(aListShapes.toString());

        System.out.printf("Наибольшая фигура:%s Вторая по величине фигура:%s", aListShapes.get(aListShapes.size() - 1), aListShapes.get(aListShapes.size() - 9));


    }
}

