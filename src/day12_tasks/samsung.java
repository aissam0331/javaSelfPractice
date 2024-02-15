package day12_tasks;

public class samsung extends iphone{

    public samsung() {

    }

    @Override
    public String getBrand() {
        return super.getBrand ( );
    }

    @Override
    public String getModel() {
        return super.getModel ( );
    }

    @Override
    public String getSize() {
        return super.getSize ( );
    }

    @Override
    public String getColor() {
        return super.getColor ( );
    }

    @Override
    public double getPrice() {
        return super.getPrice ( );
    }

    public samsung(String brand, String model, String size, String color, double price) {
        super (brand, model, size, color, price);
    }

    public void call(String phoneNumber){
        System.out.println ("Calling phone number " + phoneNumber );
    }
    public void text (String phoneNumber){
        System.out.println ("Texting phone number " + phoneNumber );
    }

    @Override
    public String toString() {
        return "samsung{} " + super.toString ( );
    }
}




