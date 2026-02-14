package day01;

import java.util.Scanner;

public class ScannerInput {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;
        System.out.println("Enter a number for a:");
        a = input.nextInt();

        System.out.println("Enter a number for b:");
        b = input.nextInt();

        System.out.println("a= " + a);
        System.out.println("b= " + b);


        double c;
        System.out.println("Enter a double for c:");
        c = input.nextDouble();
        System.out.println("c= " + c);

        input.nextLine();

        String str;
        System.out.println("Enter a string for str:");
        str = input.nextLine();
        System.out.println("str= " + str);

    }
}
