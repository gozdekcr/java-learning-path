package day05;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double weight , height;

        System.out.println("Enter your weight (kg):");
        weight = input.nextDouble();

        System.out.println("Enter your height (cm):");
        height = input.nextDouble();

        double heightInMeters = height / 100.0 ;

        double BMI = weight / (heightInMeters * heightInMeters);

        System.out.println("----------------------");
        System.out.println("Your BMI is: " + BMI);
        

        if(BMI<18.5) {
            System.out.println("Underweight");

        }else if(BMI<25.0) {
            System.out.println("Normal weight");

        }else if(BMI<30.0) {
            System.out.println("Overweight");

        }else {
            System.out.println("Obese");
        }
    }
    
}
