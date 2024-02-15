package day13_tasks;

public class Audi extends Car implements AutoPark  {
    public Audi(String make, String model, int year, double price, String color) {
        super (make, model, year, price, color);
    }



    @Override
    public void start() {
        System.out.println (" car start" );

    }

    @Override
    public void drive() {
        System.out.println (" car driving" );

    }

    @Override
    public void autoPark() {
        System.out.println (getMake () + getModel () + " " + " Has Auto park? :  " + hasAutoPark);

    }
}
