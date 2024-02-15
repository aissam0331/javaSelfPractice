package day12_tasks;

public class Rectangle {
    private double width;
    private double length;
    public double calcArea;
    public double calcPerimetre;



    public double getWidth() {
        if (width <= 0){
            System.err.println (" Width can not be negative or zero" );
            System.exit (1);
        }

        return width;

    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        if (length <= 0){
            System.err.println (" Lenght can not be negative oe zero" );
            System.exit (1);
        }
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
   public void calcArea(){
       System.out.println (length*width );
   }
   public void calcPerimetre(){
       System.out.println (2*(length*width) );

   }


    public String toString() {
        return getClass ().getSimpleName () + "{" +
                "width=" + width +
                ", length=" + length +
                ", calcArea=" + calcArea +
                ", calcPerimetre=" + calcPerimetre +
                '}';
    }
}
