package day05;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int grade;

        System.out.println("Enter your grade (0-100):");
        grade = input.nextInt();

        if (grade < 0 || grade > 100) {
            System.out.println("Please enter a value between 0-100.");
        }else if(grade>=90) {
            System.out.println("A");

        }else if(grade>=80) {
            System.out.println("B");

        }else if(grade>=70) {
            System.out.println("C");

        }else if(grade>=60) {
            System.out.println("D");

        }else {
            System.out.println("F");
        }

        
    }
    
}
