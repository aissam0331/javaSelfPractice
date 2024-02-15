package day13_tasks.Task2Device;

public abstract class Device {
    private final String brand;
    private final String model;
    private int price ;
    private String color;
    private final String size;
    boolean hasBattery;
    boolean hasPowerButton;

    public String getBrand() {
        if (brand == null || brand.isEmpty ()){
            throw new RuntimeException ("Brand can not null or empty");
        }
        return brand;
    }

    public String getModel() {
        if (model == null || model.isEmpty ()){
            throw new RuntimeException ( "Model can not be null or empty" );
        }
        return model;

    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
        if ( price <= 0){
            throw new RuntimeException ( "price can not be 0 or negative" );
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
        if (color == null || color.isEmpty ()){
            throw new RuntimeException ( "color can not be null or empty" );
        }
    }

    public String getSize() {
        if (brand == null || brand.isEmpty ()){
            throw new RuntimeException ( "Size can not be empty or null" );
        }
            return size;
    }


    public boolean isHasBattery() {
        return hasBattery;
    }

    public void setHasBattery(boolean hasBattery) {
        this.hasBattery = hasBattery;
    }

    public boolean isHasPowerButton() {
        return hasPowerButton;
    }

    public void setHasPowerButton(boolean hasPowerButton) {
        this.hasPowerButton = hasPowerButton;
    }
    abstract void turnOn();
    abstract void turnOff();

    public Device(String brand, String model, int price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.color = color;
        this.size = size;
        this.hasBattery = hasBattery;
        this.hasPowerButton = hasPowerButton;
    }

    @Override
    public String toString() {
        return getClass ().getSimpleName () + "{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", hasBattery=" + hasBattery +
                ", hasPowerButton=" + hasPowerButton +
                '}';
    }
}

