package day03;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double tip , tipRate , bill , total ;

        System.out.println("Enter the tip rate: ");
        tipRate = input.nextDouble();

        System.out.println("Enter the bill: ");
        bill = input.nextDouble();

        tip = bill * tipRate ;
        total = bill + tip ;

        System.out.println("----------------------");
        System.out.println("Tip amount: $" + tip);
        System.out.println("----------------------");
        System.out.println("Total with tip: $" + total);


        input.close();
    }
    
}
