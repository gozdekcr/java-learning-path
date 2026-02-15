package day03;

import java.util.Scanner;

public class CircleAreaCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius , area ;

        System.out.println("enter the radius: ");
        radius = input.nextDouble();

        area = Math.PI * radius * radius ;

        System.out.println("The area of the circle is : " + area);


    }
    
}
