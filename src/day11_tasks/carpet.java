package day11_tasks;

public class carpet {
    public double width;
    public double length;
    public double unitePrice;
    public boolean isPersian;

    public carpet(double width, double length, double unitePrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitePrice = unitePrice;
        this.isPersian = isPersian;
    }
    public double calcost (){
        double total ;
        total = unitePrice *(width * length) ;
        if (isPersian == true){
            total = total+200;
        }
        return total;


    }
}
