package day16;

public class Circle extends Shape implements Drawable{
    private double radius;

    public double area(){
        return Math.PI * radius * radius;
    }

    public void draw(){
        System.out.println("A circle was drawn! Area: " + area() + " Perimeter: " + perimeter());
    }

    public double perimeter(){
        return 2 * Math.PI * radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "CIRCLE: " + "radius: " + radius;
    }
}