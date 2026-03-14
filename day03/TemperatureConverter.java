package day03;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double celcius , fahrenheit ;
        System.out.println("Enter the temperature in celcius: ");
        celcius = input.nextDouble();

        fahrenheit = (celcius*1.8) + 32 ;

        System.out.println(celcius + " celcius is " + fahrenheit + " fahrenheit");

        input.close();
    }

    
}
