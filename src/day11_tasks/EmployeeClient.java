package day11_tasks;

public class EmployeeClient {
    public static void main(String[] args) {
        Emoloyee employee1 = new Emoloyee ("ali",29,"male","driver",180_000);
        Emoloyee employee2 = new Emoloyee ("hassan",78,"female","mecanic",67_000);
        System.out.println (employee2 );
        employee2.work ();
    }
}
