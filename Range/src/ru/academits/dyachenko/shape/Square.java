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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Square square = (Square) o;

        if (Double.compare(square.sideLength, sideLength) != 0) return false;
        return name.equals(square.name);

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(sideLength);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + name.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Square{" +
                "sideLength=" + sideLength +
                ", name='" + name + '\'' +
                '}';
    }
}

