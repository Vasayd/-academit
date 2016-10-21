package ru.academits.dyachenko.range;

public class RangeMain {
    public static void main(String[] args) {

        Range range = new Range(0, 100, 5, 75);


        System.out.println("Длинна диапозона:" + range.getLength1());
        System.out.println("Длинна диапозона:" + range.getLength2());

        if (range.isInside1(12)) {
            System.out.println("Число входит в диапозон");
        } else {
            System.out.println("Число не входит в диапозон");
        }
        if (range.isInside2(0)) {
            System.out.println("Число входит в диапозон");
        } else {
            System.out.println("Число не входит в диапозон");
        }
    }
}

