package day11_tasks;

public class Emoloyee {
    public String name;
    public int age;
    public String gender;
    public String jobTittle;
    public double salary;

    public Emoloyee(String name, int age, String gender, String jobTittle, double salary) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.jobTittle = jobTittle;
        this.salary = salary;
    }
    public void work(){
        System.out.println (jobTittle + " " + name +" "+  " is working " );
    }

    @Override
    public String toString() {
        return "Emoloyee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", jobTittle='" + jobTittle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
