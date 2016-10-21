package ru.academits.dyachenko.shape;

public class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
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
