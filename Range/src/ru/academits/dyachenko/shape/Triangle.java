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
        return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
    }

    @Override
    public double getHeight() {
        return Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
    }

    public double getSide() {
        return Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
    }

    @Override
    public double getArea() {
        double semiPerimeter = getPerimeter() / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - getWidth()) * (semiPerimeter - getHeight()) * (semiPerimeter - getSide()));
    }
    @Override
    public double getPerimeter() {
        return (getHeight() + getWidth() + getSide());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (Double.compare(triangle.x1, x1) != 0) return false;
        if (Double.compare(triangle.x2, x2) != 0) return false;
        if (Double.compare(triangle.x3, x3) != 0) return false;
        if (Double.compare(triangle.y1, y1) != 0) return false;
        if (Double.compare(triangle.y2, y2) != 0) return false;
        if (Double.compare(triangle.y3, y3) != 0) return false;
        return name.equals(triangle.name);

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        temp = Double.doubleToLongBits(x1);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(x2);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(x3);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(y1);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(y2);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(y3);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "name='" + name + '\'' +
                ", x1=" + x1 +
                ", x2=" + x2 +
                ", x3=" + x3 +
                ", y1=" + y1 +
                ", y2=" + y2 +
                ", y3=" + y3 +
                '}';
    }
}