package day01;

  // house
public class Main0 {
    public static void main(String[] args) {
        House house1 = new House();
        House house2 = new House();
        house2.windowShape = "square";
        house2.buildingYear = 2014;
        house2.roofColor = "blue";
        house2.doorColor = "pink";

        System.out.println(house2.doorColor);    // prints doorColor of house2
        System.out.println(house2.roofColor);    // prints roofColor of house2

        System.out.println(house1.windowShape);  // prints windowShape of house1
        System.out.println(house2.windowShape);  // prints windowShape of house2
    }
}