package day13_tasks;

public class Tesla extends Car implements AutoPark,AutoPilot{
    public Tesla(String make, String model, int year, double price, String color) {
        super (make, model, year, price, color);
    }



    @Override
    public void selfDrive() {

    }

    @Override
    public void start() {
        System.out.println ("car is starting " );

    }

    @Override
    public void drive() {
        System.out.println ("car is driving" );

    }

    @Override
    public void autoPark() {
        System.out.println (getMake () + getModel () + " has autoPark? " + hasAutoPark );

    }
}
