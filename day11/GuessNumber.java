package day11;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        int num = rand.nextInt(100);

        int guess;
        System.out.print("Enter a number between 0-99: ");
        guess = input.nextInt();

        while (guess != num && guess != -1) { 
            System.out.println("Sorry!");
            if(guess>num) {
                System.out.println("Number is less than your guess.");
            }else{
                System.out.println("Number is greater than your guess.");
            }
            System.out.print("Type -1 to quit or guess another: ");
            guess = input.nextInt();
            
        }

        if(num == guess) {
            System.out.println("Congratulations! You guess it corretc.");
        }else {
            System.out.println("Sorry, the number was " + num);
        }
       
        input.close();
    }
    
}
