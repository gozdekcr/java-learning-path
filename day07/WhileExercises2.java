package day07;

import java.util.Scanner;

public class WhileExercises2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Calculate the factorial of a given number
        System.out.println("Factorial calculation");

        int num , total=1;

        System.out.print("Enter a number: ");
        num = input.nextInt();

        System.out.print(num + "! = ");
        while(num > 0) {
            total = total * num;
            num--;

        }
        System.out.println(total);



        System.out.println();
        System.out.println("----------------------------");


        // This program prints harmonic numbers up to n.
        // What is a Harmonic Number?
        // H(n) = 1 + 1/2 + 1/3 + 1/4 + ... + 1/n
        System.out.println("Harmonic Number");

        double harNum;
        double harmonic=0.0;

        System.out.print("Enter n (how many harmonic numbers to print): ");
        harNum = input.nextInt();

        while(harNum > 0) {
            harmonic = harmonic + (1/harNum);
            harNum--;

        }
        System.out.println("result: " + harmonic);





        System.out.println();
        System.out.println("----------------------------");

        // This program prints a star pattern up to the number entered by the user.
        // Example: if user enters 3
        // *
        // **
        // ***

        System.out.println("Stars");

        int star;
        int total2 = 1;
        System.out.print("Enter a number for stars:");
        star = input.nextInt();

        for(int i = 1 ; i<=star ; i++) {
            for(int j = 1 ; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }



        System.out.println();
        System.out.println("----------------------------");


        // This program calculates the power of a number.
        // It takes a base and an exponent from the user.

        System.out.println("Exponential numbers");

        int baseNum , expNum, result=1 , i=1 ;

        System.out.println("Enter the base number: ");
        baseNum = input.nextInt();

        System.out.println("Enter the exponent: ");
        expNum = input.nextInt();

        while(i <= expNum) {
            result= result * baseNum;
            i++;

        }
        System.out.println("Result: " + result);




        





    }
    
}
