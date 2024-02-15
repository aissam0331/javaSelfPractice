package day13_tasks;

public class Honda extends Car{
    public Honda(String make, String model, int year, double price, String color) {
        super (make, model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println (getMake () + getModel () + " Is starting" );

    }

    @Override
    public void drive() {
        System.out.println (getMake () + getModel () + " Is driving " );

    }
}
