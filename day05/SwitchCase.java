package day05;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number (1-3): ");
        int num = input.nextInt();

        switch(num) {
            case 1:
                System.out.println("This number is 1");
                break;
            case 2:
                System.out.println("This number is 2");
                break;
            case 3:
                System.out.println("This number is 3");
                break;
            default:
                System.out.println("Enter a number between 1-3");
                break;
        }
        
    }
}
