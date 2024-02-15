package day11_tasks;

public class Pizza {
    public String size;
    public int numberOfcheeseTopping;
    public int numberOfpepporoniTopping;

    public Pizza(String size, int numberOfcheeseTopping, int numberOfpepporoniTopping) {
        this.size = size;
        this.numberOfcheeseTopping = numberOfcheeseTopping;
        this.numberOfpepporoniTopping = numberOfpepporoniTopping;
    }
    public double Calcost(){
        int topping = (numberOfcheeseTopping+numberOfpepporoniTopping)*2;

        double totale = 0;
        double pizzaPrice ;

        if (size.equalsIgnoreCase ("small")){
            pizzaPrice=10;
        } else if (size.equalsIgnoreCase ("medium")) {
            pizzaPrice=12;
        }else {
            pizzaPrice=14;
        }

        totale = pizzaPrice + topping;

        return totale;




    }


    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfcheeseTopping=" + numberOfcheeseTopping +
                ", numberOfpepporoniTopping=" + numberOfpepporoniTopping +
                '}';
    }
}
