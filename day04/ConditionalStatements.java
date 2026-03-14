package day04;

import java.util.Scanner;

public class ConditionalStatements {
    public static void main(String[] args) {
        

        Scanner input = new Scanner(System.in);

        double num1 , num2 ;

        System.out.println("Enter number 1:");
        num1 = input.nextDouble();

        System.out.println("Enter number 2:");
        num2 = input.nextDouble();

        if(num1>num2) {
            System.out.println("Number 1 is greater than number 2.");

        } else if (num1<num2) {
            System.out.println("Number 1 is less than number 2.");
            
        } else {
            System.out.println("Number 1 and Number 2 are equal!");
        
        } 

        input.close();
    }
    
}
