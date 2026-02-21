package day07;

import java.util.Scanner;

public class DoWhileExercise {

    public static void main(String[] args) {

        // This is a program that reads numbers from the user and adds up only the even numbers.
        // It continues to ask for input until the user enters a negative number.

        Scanner input = new Scanner(System.in);

        int num, result=0;

        do { 
            System.out.print("Enter a number:");
            num = input.nextInt();
            if( num % 2 == 0) {
                result += num;
            }
            
        } while(num > 0);
        System.out.println("Sum of evens: " + result);



    }
    
}
