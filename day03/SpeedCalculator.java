package day03;

import java.util.Scanner;

public class SpeedCalculator {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double distance , time , speed ;

    System.out.println("Enter the distance: ");
    distance = input.nextDouble();

    System.out.println("Enter the time: ");
    time = input.nextDouble();

    speed = distance / time ;

    System.out.println("Speed is: " + speed);


    }
}
