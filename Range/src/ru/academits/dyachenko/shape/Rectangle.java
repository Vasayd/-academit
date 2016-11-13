package ru.academits.dyachenko.shape;

public class Rectangle implements Shape {
    private String name;
    private double width;
    private double height;

    public Rectangle(String name, double width, double height) {
        this.name = name;
        this.width = width;
        this.height = height;
    }
    public String getName() {
        return name;
    }

    @Override
    public double getWidth() {
        return width;
    }

    @Override
    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return (height * width);
    }

    @Override
    public double getPerimeter() {
        return (2 * (height + width));
    }
}
