package ru.academits.dyachenko.range;

public class RangeMain {
    public static void main(String[] args) {

        Range range = new Range(0, 100);

        System.out.println("Длинна диапозона:" + range.getLength());

        if (range.isInside(12)) {
            System.out.println("Число входит в диапозон");
        } else {
            System.out.println("Число не входит в диапозон");
        }
    }
}