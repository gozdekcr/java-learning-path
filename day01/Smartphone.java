package day01;

public class Smartphone {
    public String brand;
    public String model;
    public int storage;                 // in GB
    public double price;

    public void displayDetails() {
        System.out.println("Phone: " + brand + " " + model);
        System.out.println("Storage: " + storage + "GB");
        System.out.println("Price: $" + price);
        System.out.println("-------------------------");
    }

    // a method to upgrade storage
    public void upgradeStorage(int extraStorage) {
        storage = storage + extraStorage;
        price = price + 100;           // every upgrade adds $100 to the price
    }
}
    