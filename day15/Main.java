package day15;

public class Main {
    public static void main(String[] args) {
        Shape t1 = new Triangle(5, 10);
        Shape c1 = new Circle(7);
        Shape r1 = new Rectangle(13, 9);

        printArea(t1);
        printArea(c1);
        printArea(r1);

    

    }
    static void printArea(Shape s) {
        System.out.println(s.getName() + " area is: " + s.area());
    }
}
