package day16;
import java.util.ArrayList;

public class ShapeApp {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        ArrayList<Drawable> drawables = new ArrayList<Drawable>();

        shapes.add(new Circle(5.0));
        shapes.add(new Rectangle(3.4,5.3));

        
        for(int i=0 ; i< shapes.size() ; i++){
            System.out.println(shapes.get(i).toString());
        }

        //or
        for(Shape s : shapes) {
            System.out.println(s.toString());
        }

        drawables.add(new Text("hello"));
        drawables.add(new Circle(7.5));
        drawables.add(new Rectangle(4,8));

        for(Drawable d : drawables) {
            d.draw();
        }
    }
}