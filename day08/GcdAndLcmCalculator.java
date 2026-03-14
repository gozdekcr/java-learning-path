package day08;

import java.util.Scanner;

public class GcdAndLcmCalculator {

    public static void main(String[] args) {

        // GCD (Greatest Common Divisor)
        // GCD is the largest number that divides both numbers evenly.
        // LCM (Least Common Multiple)
        // LCM is the smallest number that is divisible by both numbers.

        Scanner input = new Scanner(System.in);

        int num1 , num2 , gcd = 1 , lcm;

        System.out.print("Please enter the numbers: ");
        num1 = input.nextInt();
        num2 = input.nextInt();

        int min = (num1 < num2) ? num1 : num2;

        for(int i = min ; i > 0 ; i--) {
            if((num1 % i == 0) && (num2 % i == 0)) {
                gcd = i;
                break;
                
            }

        }

        lcm = (num1 * num2) / gcd;

        System.out.println("Numbers: " + num1 + " " + num2);
        System.out.println("GCD (Greatest Common Divisor): " + gcd);
        System.out.println("LCM (Least Common Multiple)" + lcm);
     
        input.close();
    }
}
