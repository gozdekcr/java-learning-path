package day03;

import java.util.Scanner;

public class VatCalculator {
    public static void main(String[] args) {
        double price , priceWithVat , vat=0.18;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the price: ");
        price = input.nextDouble();
        priceWithVat = price + (price*vat);
        System.out.println(priceWithVat);

    }
}
