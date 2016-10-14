
import java.util.Scanner;

public class Range {
    private double from;
    private double to;

    public Range(double from, double to) {

        this.from = from;
        this.to = to;
    }

    public double getFrom() {
        return from;
    }

    public double getTo() {
        return to;
    }

    public void setFrom(double from) {
        this.from = from;
    }

    public void setTo(double to) {
        this.to = to;
    }

    public void rangeLenght() {
        System.out.println("Длинна диапозона:" + (to - from));
    }

    public boolean isInside() {

        main p = new main();
        double x = p.xim();

        if ((x >= from && x <= to)) {
            return true;
        } else {
            return false;
        }
    }
}