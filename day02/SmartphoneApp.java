package day02;

    // smartphone
public class SmartphoneApp {
    public static void main(String[] args) {
        // creating the first phone
        Smartphone phone1 = new Smartphone();
        phone1.brand = "Apple";
        phone1.model = "iPhone 15";
        phone1.storage = 128;
        phone1.price = 799.0;

        // creating the second phone
        Smartphone phone2 = new Smartphone();
        phone2.brand = "Samsung";
        phone2.model = "Galaxy S23";
        phone2.storage = 256;
        phone2.price = 899.0;

        // showing initial details
        phone1.displayDetails();
        phone2.displayDetails();

        // updating phone1 properties
        phone1.upgradeStorage(128); // Upgrading storage by 128GB
        
        System.out.println("AFTER UPGRADE:");
        phone1.displayDetails();
    }
}