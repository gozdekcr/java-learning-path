package day10;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        //dataType arrayName[] = new dataType[size];
        //dataType[] arrayName = new dataType[size];
        //dataType[] arrayName = {d1,d2,d3,d4};

        //an array with 4 elements
        int[] list = new int[4];

        list[0] = 1;
        list[1] = 2;
        list[2] = 3;
        list[3] = 4;

        System.out.println(list[0]);
        System.out.println(list[1]);
        System.out.println(list[2]);
        System.out.println(list[3]);


        for(int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }

        
        int[] list2 = new int[4];
        Scanner input = new Scanner(System.in);
        for(int i = 0; i< list2.length; i++) {
            System.out.print("Enter a number: ");
            list2[i] = input.nextInt();
        }

        for(int i = 0; i < list2.length; i++) {
            System.out.println(list2[i]);
        }

        input.close();
    }

}
