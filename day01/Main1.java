package day01;

   // calculator
public class Main1 { 
    public static void main(String[] args) {
        Calculator cal1 = new Calculator();
        cal1.addition(7, 35);

        System.out.println("the value in cal1: " + cal1.result());


        Calculator cal2 = new Calculator();
        cal2.addition(1 ,3);      // result was 0 so result= 0+1+3= 4
        cal2.addition(2, 5);      // result was 4 so result= 4+2+5= 11

        System.out.println("the value of cal2: " + cal2.result());
    }
}
