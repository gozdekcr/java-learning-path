package day10;

public class EmpDriver {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1992, 45, 2000, "Mia");
        System.out.println(emp1.tax());
        System.out.println(emp1.raiseSalary());
        System.out.println(emp1.bonus());

        
    }

}
