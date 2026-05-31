package day18;

public class ThrowException {
    public static void main(String[] args) {
        int a=0;

        if(a == 0) {
            System.out.println("denominator cannot be zero!");
            throw new ArithmeticException("Exception!");
        }
    }  
}
