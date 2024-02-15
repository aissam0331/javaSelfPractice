package day11_tasks;

public class carpetClient {
    public static void main(String[] args) {
        carpet Carpet1 = new carpet (12.3,9.5,10,true);
        carpet Carpet2 = new carpet (3.4,6,8,false);
        System.out.println (Carpet2.calcost () );
        System.out.println (Carpet1.calcost () );



    }
}
