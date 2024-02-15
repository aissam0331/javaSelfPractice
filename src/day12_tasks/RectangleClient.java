package day12_tasks;

public class RectangleClient {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle (0,0);

        rec.setLength (-5.4);
        rec.setWidth (2.0);

        System.out.println (rec.getLength () );
        System.out.println (rec.getWidth () );


        rec.calcPerimetre ();
        rec.calcArea ();

    }
}
