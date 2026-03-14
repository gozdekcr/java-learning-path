package day03;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        int quiz , midterm , finals ;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter quiz grade: ");
        quiz = input.nextInt();
        System.out.println("Enter midterm grade: ");
        midterm = input.nextInt();
        System.out.println("Enter final grade: ");
        finals = input.nextInt();

        double average = (quiz * 0.2) + (midterm * 0.3) + (finals * 0.5);

        System.out.println("Your average grade is: " + average);

        String result = (average >= 50) ? "You passed!" : "You failed!";

        System.out.println(result);

        input.close();
    }
}
