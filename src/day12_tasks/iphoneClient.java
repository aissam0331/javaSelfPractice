package day12_tasks;

public class iphoneClient {
    public static void main(String[] args) {
        samsung sum1 = new samsung ();
        sum1.setBrand ("samsung");
        sum1.setModel ("S3");
        sum1.setSize ("small");
        sum1.setColor ("black");
        sum1.setPrice (80);
        System.out.println (sum1.getSize () +"\t" +sum1.getBrand ()+"\t" +sum1.getColor () +"\t"+ sum1.getModel ()  +"\t"+ sum1.getPrice ());
        nokia Nokia = new nokia (  );
        Nokia.setBrand ("nokia");
        Nokia.setPrice (105);
        System.out.println (Nokia.getBrand ()+"\t"+Nokia.getPrice () );
        iphone Iphone1 = new iphone ();
        Iphone1.getBrand ();
        System.out.println (Iphone1);




    }
}
