package day04;

import java.util.Scanner;

public class BirthdayCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //birth date
        System.out.print("Enter your birth day: ");
        int birthDay = input.nextInt();

        System.out.print("Enter your birth month: ");
        int birthMonth = input.nextInt();

        System.out.print("Enter your birth year: ");
        int birthYear = input.nextInt();

        //current date
        System.out.print("Enter current day: ");
        int currentDay = input.nextInt();

        System.out.print("Enter current month: ");
        int currentMonth = input.nextInt();

        System.out.print("Enter current year: ");
        int currentYear = input.nextInt();

        int years = currentYear - birthYear;
        int months = currentMonth - birthMonth;
        int days = currentDay - birthDay;


        if (days < 0) {
            months--;
            int prevMonth = currentMonth - 1;
            int prevYear = currentYear;
            if (prevMonth == 0) {
                prevMonth = 12;
                prevYear--;
            }
            days += getDaysInMonth(prevMonth, prevYear);
        }
 
        if (months < 0) {
            years--;
            months += 12;
        }

        System.out.println("Your age is: " + years + " years, " + months + " months, " + days + " days");



        input.close();  
    }

    static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

    }

    static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            default:
                return 0;
        }
    }

}
