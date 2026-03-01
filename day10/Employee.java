package day10;

public class Employee {

    private String name;
    private double salary;
    private int workHour , hireYear;

    Employee(int hireYear, int workHour, double salary, String name) {
        this.hireYear = hireYear;
        this.workHour = workHour;
        this.salary = salary;
        this.name = name;
    }

    public double tax() {
        if(this.salary >= 1000){
            return this.salary*0.3;
        }else {
            return 0.0;
        }
    }

    public double bonus() {
        return 30 * this.workHour;
    }

    public double raiseSalary() {
        int year = 2026 - this.hireYear;
        if(year<10) {
            return this.salary * 0.05 ;
        }else if(year>=10 && year <20){
            return this.salary * 0.10;
        }else {
            return this.salary * 0.15;
        }
    }

    
}


