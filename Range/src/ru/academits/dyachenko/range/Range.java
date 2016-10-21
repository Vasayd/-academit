package ru.academits.dyachenko.range;

public class Range {
    private double from1;
    private double to1;
    private double from2;
    private double to2;

    public Range(double from1, double to1, double from2, double to2) {

        this.from1 = from1;
        this.to1 = to1;
        this.from2 = from2;
        this.to2 = to2;
    }

    /*  public double getFrom() {
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
  */
    public double getLength1() {
        return (to1 - from1);
    }

    public double getLength2() {
        return (to2 - from2);
    }

    public boolean getIntervalIntersection() {
       return (from1 <= to2 && to1 >= from2) ;
        }


    public void getUnitedInterval() {

    }

    public void getDifferenceInterval() {

    }

    public boolean isInside1(double x) {
        return (x >= from1 && x <= to1);
    }

    public boolean isInside2(double x) {
        return (x >= from2 && x <= to2);
    }
}
