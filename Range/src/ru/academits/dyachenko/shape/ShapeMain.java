package ru.academits.dyachenko.shape;

import java.util.Arrays;

public class ShapeMain {
    public static void main(String[] args) {

        Square square1 = new Square(12);
        Square square2 = new Square(2);
        Square square3 = new Square(172);
        Triangle triangle1 = new Triangle(1, 1, 2, 3, 4, 5);
        Triangle triangle2 = new Triangle(23, 112, 3, 2, 1, 1);
        Rectangle rectangle1 = new Rectangle(1, 2);
        Rectangle rectangle2 = new Rectangle(41, 25);
        Circle circle1 = new Circle(1);
        Circle circle2 = new Circle(54);

        Double[] array = new Double[]{square1.getArea(), square2.getArea(), square3.getArea(), triangle1.getArea(),
                triangle2.getArea(), rectangle1.getArea(), rectangle2.getArea(), circle1.getArea(), circle2.getArea()};

        System.out.println(Arrays.toString(array));
        Arrays.sort(array);


        System.out.println(Arrays.toString(array));
        System.out.printf("%s %s",array[array.length-1], array[array.length-2]);
    }
}
