package day09;

import java.util.Scanner;

public class RecursiveMethods {

    //Factorial
    static long factorial(int n) {

        if(n<0) {
            System.out.println("Invalid number! Please enter a number greater or equal than 0.");
            return -1;

        }else if(n<=1) {
            return 1;

        }else {
            return n * factorial(n-1);
        }
    }



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        long result = factorial(number);

        System.out.println(number + "! = " + result);

    input.close();
    }

}
