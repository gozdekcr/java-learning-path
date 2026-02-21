package day07;

import java.util.Scanner;

public class WhileExercises1 {
    public static void main(String[] args) {



        //Even numbers 0 to 100
        System.out.println("Even numbers with for loop");
        for(int i=0 ; i<=100 ; i+=2) {
            System.out.print(i + " ");
        }


        System.out.println();
        System.out.println("-----------------------------");
        System.out.println("Even numbers with while");

        int b= 1;
        while(b<=100) {
            if( b % 2 == 0) {
                System.out.print(b + " ");
            }
            b++;
        }



        System.out.println();
        System.out.println("----------------------------");

        //This program prints all powers of 2 up to the number entered by the user.
        System.out.println("Powers of 2");

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number:");
        int number = input.nextInt();
        int k = 1;

        while(k<= number) {
            System.out.println(k);
            k = k * 2;
        }





        System.out.println();
        System.out.println("----------------------------");



        // Read numbers from user until a negative number is entered.
        // If the number is negative , break 
        // If the number is odd , add it to total and print running total
        // If the number is even ,then skip

        
        
        int num, total=0;
        while (true) { 
            System.out.print("Enter a number: ");
            num = input.nextInt();

            if(num < 0) {
                System.out.println("total even numbers= " + total);
                break;
                
            }else if(num % 2 != 0) {
                total = total + num;
                
                
            }
               



        











        }
    }
}
