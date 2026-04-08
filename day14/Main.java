package day14;

public class Main {
    public static void main(String[] args) {

        //Inheritance, overriding ,polymorphism
        
        String[] cources1 = {"ceng1008", "ceng3050"};
        Academician p1 = new Academician("Leo" , "ronald.leo@gmail.com" , "05555555555", "ceng" , cources1);
        System.out.println(p1);

        String[] cources2 = {"math1542", "math2345" , "math3245" , "math2006"};
        Assistant p2 = new Assistant("Claire Dennes", "dennes.c@gmail.com", "04444444444", "math", cources2, "Res. Asst.");
        System.out.println(p2);


        Clerk p3 = new Clerk("Henry John", "henry.jhn@gmail.com", "08888888888", " ", null);



    }
}
