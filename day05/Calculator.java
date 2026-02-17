package day05;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 , num2 , operator ;

        System.out.println("Enter first number:");
        num1 = input.nextInt();

        System.out.println("Enter second number:");
        num2 = input.nextInt();

        System.out.println("Select an operation:\n" + //
                        "1. Addition       (+)\n" + //
                        "2. Subtraction    (-)\n" + //
                        "3. Multiplication (*)\n" + //
                        "4. Division       (/)\n" + //
                        "Enter your choice (1-4):");

        operator = input.nextInt();


        if(operator==1) {
            System.out.println(num1 + "+"+ num2 + "=" + (num1 + num2));
        }else if(operator==2) {
            System.out.println(num1 + "-"+ num2 + "=" + (num1 - num2));
        }else if(operator==3) {
            System.out.println(num1 + "x"+ num2 + "=" + (num1 * num2));
        }else if(operator==4) {
            if(num2==0) {
                System.out.println("Division by zero is not allowed!");
            }else {
                System.out.println(num1 + "/"+ num2 + "=" + (num1 / num2));
            }
        
        }else {
            System.out.println("Please enter a number between 1 and 4.");
        }
            
       
    }
    
}
