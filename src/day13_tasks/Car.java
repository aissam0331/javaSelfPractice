package day13_tasks;

public abstract class Car {
    private final String make;
    private final String model;
    private  int year;
    private  double price;
    private String color;




    public String getMake() {
        return make;
    }
    public void setMake( String make){
        if (make == null || make.isEmpty () ){
            throw new RuntimeException ( "make can not be null or empty" );
        }
    }
    public String getModel() {

        return model;
    }
    public void setModel( String model){

        if (model == null|| model.isEmpty ()){
            throw new RuntimeException ( "model can not null or empty" );
        }
    }

    public int getYear() {
        if (year<= 1886){
            throw new RuntimeException ( "Cant" );
        }
        return year;
    }
    public void setYear(int year){
        if (year<1886){
            throw new RuntimeException ( " year can not be under 1886" );
        }

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
        if (price<=0){
            throw new RuntimeException ( " price can not be 0 or negative" );
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






    public Car(String make, String model, int year, double price, String color) {
       this.make = make;
        this.model = model;
        setYear (year);
        this.price = price;
        this.color = color;
    }

   public abstract void start();
    public abstract void drive();

    public void stop(){
        System.out.println (make + model + " is stopped " );
    }

    @Override
    public String toString() {
        return "car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
