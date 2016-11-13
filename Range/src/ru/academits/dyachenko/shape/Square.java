package ru.academits.dyachenko.shape;

public class Square implements Shape {
    private double sideLength;
    private String name;

    public Square(String name, double sideLength) {
        this.name = name;
        this.sideLength = sideLength;
    }

    public String getName() {
        return name;
    }

    @Override
    public double getWidth() {
        return sideLength;
    }

    @Override
    public double getHeight() {
        return sideLength;
    }

    @Override
    public double getArea() {
        return (sideLength * sideLength);
    }

    @Override
    public double getPerimeter() {
        return (sideLength * 4);
    }

}

