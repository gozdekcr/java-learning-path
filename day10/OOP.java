package day10;

public class OOP {
    public static void main(String[] args) {
        //Object Oriented Programming
        //ClassName objectName = new ClassName();
        //Constructor

        Calculator cal1 = new Calculator(10,4);
        cal1.add();
        System.out.println(cal1.add());

        System.out.println(cal1.subtraction());

        Calculator cal2 = new Calculator(20,89);
        System.out.println(cal2.divi());
        System.out.println(cal2.mult());
        


        
        

    
    }
}
