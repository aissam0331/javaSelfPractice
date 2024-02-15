package day13_tasks;


public class CarClients {
    public static void main(String[] args) {

        Toyota corolla = new Toyota ("Toyota","Corolla",2000,1000,"Red");
        System.out.println (corolla );
        corolla.start ();
        corolla.drive ();

        Honda accord = new Honda ("Honda","Accord",1950,300,"Grey");
        System.out.println (accord );

        Audi Q3 = new Audi ("audi","Q3",2019,20_000,"white");
        System.out.println (Q3 );
        Q3.autoPark ();
        Mercedes mercedes = new Mercedes ("mercedes","C63",2010,10_000,"black");
        mercedes.drive ();
        mercedes.start ();
        mercedes.autoPark ();

        Tesla tesla = new Tesla ("tesla ","model S",2019,30_000,"green");
        System.out.println (tesla );
        tesla.selfDrive ();
        tesla.start ();
        tesla.drive ();
        tesla.autoPark ();


        boolean r1 = mercedes instanceof Mercedes;
        System.out.println (r1 );
        boolean r2 = Q3 instanceof Car;
        System.out.println (r2 );
        boolean r3 = corolla instanceof Flyable;
        System.out.println (r3 );















    }
}
