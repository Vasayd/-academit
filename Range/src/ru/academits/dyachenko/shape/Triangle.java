package ru.academits.dyachenko.shape;

import static jdk.nashorn.internal.objects.NativeMath.max;
import static jdk.nashorn.internal.objects.NativeMath.min;

public class Triangle implements Shape {
    private String name;
    private double x1;
    private double x2;
    private double x3;
    private double y1;
    private double y2;
    private double y3;

    public Triangle(String name, double x1, double x2, double x3, double y1, double y2, double y3) {
        this.name = name;
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
    }

    public String getName() {
        return name;
    }
    @Override
    public double getWidth() {
        return Math.max(x1, Math.max(x2, x3)) - Math.min(x1, Math.min(x2, x3));
    }
    @Override
    public double getHeight() {
        return  Math.max(y1, Math.max(y2, y3)) - Math.min(y1, Math.min(y2, y3));
    }

    @Override
    public double getArea() {
        return ((1 / 2.0) * ( Math.max(x1, Math.max(x2, x3)) - Math.min(x1, Math.min(x2, x3))) * (Math.max(y1, Math.max(y2, y3)) - Math.min(y1, Math.min(y2, y3))));
    }

    @Override
    public double getPerimeter() {
        return 2*(getWidth()+getHeight());
    }
}
