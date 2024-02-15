package day13_tasks.Task2Device;

public abstract class Phone extends Device{
    public Phone(String brand, String model, int price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super (brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    public void call(long phoneNumber){

    }
    public void text(long phoneNumber){

    }

    @Override
    public String toString() {
        return "Phone{" +
                "hasBattery=" + hasBattery +
                ", hasPowerButton=" + hasPowerButton +
                "} " + super.toString ( );
    }
}
