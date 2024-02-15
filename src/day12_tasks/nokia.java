package day12_tasks;

public class nokia extends iphone {
    public nokia() {
        super ( );
    }

    @Override
    public String getBrand() {
        return super.getBrand ( );
    }

    @Override
    public void setBrand(String brand) {
        super.setBrand (brand);
    }

    @Override
    public String getModel() {
        return super.getModel ( );
    }

    @Override
    public void setModel(String model) {
        super.setModel (model);
    }

    @Override
    public String getSize() {
        return super.getSize ( );
    }

    @Override
    public void setSize(String size) {
        super.setSize (size);
    }

    @Override
    public String getColor() {
        return super.getColor ( );
    }

    @Override
    public void setColor(String color) {
        super.setColor (color);
    }

    @Override
    public double getPrice() {
        return super.getPrice ( );
    }

    @Override
    public void setPrice(double price) {
        super.setPrice (price);
    }

    public nokia(String brand, String model, String size, String color, double price) {
        super (brand, model, size, color, price);
    }

    @Override
    public void call(String phoneNumber) {
        super.call (phoneNumber);
    }

    @Override
    public void text(String phoneNumber) {
        super.text (phoneNumber);
    }

    @Override
    public String toString() {
        return super.toString ( );
    }
}
