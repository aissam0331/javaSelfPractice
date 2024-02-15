package day12_tasks;

public class iphone {
    private String brand, model, size,color;
    private double price;

    public iphone() {

    }

    public String getBrand() {
        if ( brand == null||brand.isEmpty ()||brand.isBlank ()) {
            System.err.println ( "brand can not be null or empty,blank" );
            System.exit (1);
        }
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        if (model == null || model.isEmpty ( ) || model.isBlank ( )) {
            System.err.println ("model can not be null or empty,blank");
            System.exit (1);
        }

            return model;
        }

        public void setModel (String model){
            this.model = model;
        }

        public String getSize () {
            return size;
        }

        public void setSize (String size){
            this.size = size;
        }

        public String getColor () {
            if (color == null || color.isEmpty ( ) || color.isBlank ( )) {
                System.err.println ("color can not be null or empty,blank");
                System.exit (1);
            }

                return color;
            }

            public void setColor (String color){
                this.color = color;
            }

            public double getPrice () {
                if (price <= 0) {
                    System.err.println ("price can not be 0 or negative");
                    System.exit (1);
                }

                return price;
            }

            public void setPrice ( double price){
                this.price = price;
            }

    public iphone(String brand, String model, String size, String color, double price) {
        setBrand (brand);
        setModel (model);
        setSize (size);
        setColor (color);
        setColor (color);
    }
    public void call(String phoneNumber){
        System.out.println ("calling the number " + phoneNumber );
    }
    public void text(String phoneNumber){
        System.out.println ("texting the number " + phoneNumber);
    }

    @Override
    public String toString() {
        return "iphone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}