package day09;

public class Overloading {

    static void area(double radius) {
        double result = Math.PI * radius * radius;
        System.out.println("Area is: " + result);
    }

    static void area(double width , double height) {
        double result = width * height ;
        System.out.println("Area is: " + result);
    }

    public static void main(String[] args) {

        area(3.0);                   // circle
        area(4.0, 5.0);       // rectangle
        area(7.0);                  // circle

    
    }
    
}
