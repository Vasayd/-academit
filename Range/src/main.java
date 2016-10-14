import java.util.Scanner;

public class main {


    public double xim() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число:");
        return scanner.nextDouble();
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите нижний порог диапозона:");
        double from = scanner.nextDouble();

        System.out.print("Введите верхний порог диапозона:");
        double to = scanner.nextDouble();

        Range range = new Range(from, to);
        range.rangeLenght();

        if (range.isInside()) {
            System.out.println("Число входит в диапозон");
        } else {
            System.out.println("Число не входит в диапозон");
        }
    }

}