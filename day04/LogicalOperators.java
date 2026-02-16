package day04;

public class LogicalOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 20;

        boolean log1 = a<b;
        boolean log2 = d>=c;
        boolean result = (log1 && log2);
        System.out.println(result);
    }
    
}
