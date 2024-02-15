package day12_tasks;

public class Class {
    private double radius;
    private double calcArea;
    private double calcPerimetre;

    public double getRadius() {
        if (radius <= 0 ) {
            System.out.println ("radius can not be 0 or negative num");
            System.exit (1);
        }
        return radius;

    }
    public void setRadius(double radius) {

        this.radius = radius;



    }

    public double getCalcArea() {
        calcArea = radius*radius*2;
        return calcArea;
    }

    public void setCalcArea(double calcArea) {
        this.calcArea = calcArea;
    }

    public double getCalcPerimetre() {
        calcPerimetre = radius * 2 *(3.14);
        return calcPerimetre;
    }

    public void setCalcPerimetre(double calcPerimetre) {
        this.calcPerimetre = calcPerimetre;
    }

    @Override
    public String toString() {
        return "Class{" +
                "radius=" + radius +
                ", calcArea=" + calcArea +
                ", calcPerimetre=" + calcPerimetre +
                '}';
    }
}
