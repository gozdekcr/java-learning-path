package day14;

public class Main {
    public static void main(String[] args) {

        //Inheritance, overriding ,polymorphism
        
        String[] cources1 = {"ceng1008", "ceng3050"};
        Academician A = new Academician("Leo" , "ronald.leo@gmail.com" , "05555555555", "ceng" , cources1);
        System.out.println(A);
    }
}
