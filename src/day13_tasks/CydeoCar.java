package day13_tasks;

public class CydeoCar extends Car implements AutoPark,AutoPilot,Flyable{
    public CydeoCar(String make, String model, int year, double price, String color) {
        super (make, model, year, price, color);
    }



    @Override
    public void selfDrive() {
        System.out.println (getMake () + getModel () + " has auto pilot ? " + hasAutoPilot);

    }

    @Override
    public void start() {
        System.out.println (" car is starting " );

    }

    @Override
    public void drive() {
        System.out.println (" car is driving" );

    }

    @Override
    public void fly() {
        System.out.println (getMake () + getModel () + " can fly ? " + canFly );

    }

    @Override
    public void autoPark() {
        System.out.println (getMake () + getModel () + " has auto park ? " + hasAutoPark );


    }
}
