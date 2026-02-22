package day08;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {

        // Fibonacci series is a sequence where each number is the sum
        // of the two preceding numbers.

        Scanner input = new Scanner(System.in);
        System.out.print("How many Fibonacci numbers do you want?: ");
        int count = input.nextInt();

        int first= 0;
        int second= 1;

        for(int i=0 ; i<=count; i++) {

            System.out.print(first + " ");

            // Calculate next number by adding first + second
            int next = first + second;

            // second becomes first, next becomes second
            first = second;  
            second = next;    

        }

    }
    
}
