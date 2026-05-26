package day16;

public class Text implements Drawable {
    private String text;

    public Text(String text){
        this.text=text;
    }

    public void draw(){
        System.out.println("A text was drawn : " + text);
    }
}