package day18;

import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("start");
        try {
            int a = 2 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("end");


        //int[] arr = new int[3];
        int b;

        try {
            //arr[4] = 10;
            b = input.nextInt();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.toString());
        }catch(Exception e) {
            System.out.println(e.toString());
        }finally {
            System.out.println("It will work al the time!");
        }

    }
}
