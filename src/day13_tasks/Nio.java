package day13_tasks;

public class Nio extends Car implements AutoPilot, AutoPark{
    public Nio(String make, String model, int year, double price, String color) {
        super (make, model, year, price, color);
    }



    @Override
    public void selfDrive() {

    }

    @Override
    public void start() {
        System.out.println (" car is starting " );

    }

    @Override
    public void drive() {
        System.out.println (" car s driving " );

    }

    @Override
    public void autoPark() {
        System.out.println (getMake ()  + getModel () + " has autoPark " + hasAutoPark );

    }
}
