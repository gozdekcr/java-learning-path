package day11;

import java.util.Scanner;

public class ArrayAverage {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        int[] notes = new int[5];

        System.out.println("-----------------------------");
        System.out.println("Enter your notes respectively: ");

        System.out.print("Calculus2: ");
        notes[0] = input.nextInt();

        System.out.print("Physics2: ");
        notes[1] = input.nextInt();

        System.out.print("Basic Algebra: ");
        notes[2] = input.nextInt();

        System.out.print("Object Oriented Programming: : ");
        notes[3] = input.nextInt();

        System.out.print("Computer Science: ");
        notes[4] = input.nextInt();

        int sum = 0;

        for(int note : notes) {
            sum += note;

        }
        System.out.println("Average is: " + (sum / notes.length));

        input.close();
    }
}