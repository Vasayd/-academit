import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Range range = new Range(0, 100);
        range.rangeLenght();

        if (range.isInside()) {
            System.out.println("Число входит в диапозон");
        } else {
            System.out.println("Число не входит в диапозон");
        }
    }

    public double xim() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число:");
        return scanner.nextDouble();
    }
}