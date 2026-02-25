package day09;

public class MethodBasics {

    static void greet(String name) {
        System.out.println("Hello " + name +  "!");
    }

    static void add(int a , int b) {
        int result = a + b ;
        System.out.println(result);
    }

    static void constant(int x) {    
        x = 287;
        System.out.println(x);
    }


    public static void main(String[] args) {

        greet("Gözde");

        add(2, 3);

        constant(45);      // the original value in constant() stays unchanged.
        }
    }


