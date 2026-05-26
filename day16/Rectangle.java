package day16;

public class Rectangle extends Shape implements Drawable {
    private double height;
    private double width;

    public double area(){
    return height * width;
    }

    public void draw(){
        System.out.println("A rectangle was drawn! Area: " + area() + " Perimeter: " + perimeter());
    }

    public double perimeter(){
        return 2* height + 2 * width ;
    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public String toString() {
        return "RECTANGLE: " + "height: " + height + " width: " + width;
    }
}