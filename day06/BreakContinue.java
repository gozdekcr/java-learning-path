package day06;

import java.util.Scanner;

public class BreakContinue {

    public static void main(String[] args) {
        
        //break = Exit the loop completely
        //continue = Skip current iteration and keep going

        Scanner input = new Scanner(System.in);


        //BREAK EXAMPLE
        System.out.println("Break example");
        int num ,total =0;

        while(true) {
            System.out.print("Enter a number: ");
            num = input.nextInt();

            if(num==0) {
                break;
            }

            total += num;
            System.out.println("Running total: " + total);
        }


        //CONTINUE EXAMPLE
        System.out.println("Continue example");
        for(int i=1; i<=10 ; i++) {
            if(i==4 || i==9) {
                System.out.println("skipped= " + i);
                continue;
            }
            System.out.println("i= " + i);
        }



        input.close();
    }
    
}
