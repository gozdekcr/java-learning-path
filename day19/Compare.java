package day19;

public class Compare<T> {
    
    public static <T extends Comparable<T>> T max(T a, T b) {
        if (a.compareTo(b) > 0) {
            return a;
        } else {
            return b;
        }
    }

    public static <T extends Comparable<T>> T max(T a, T b, T c) {
        T max1 = max(a, b);
        return max(max1, c);
    }

    public static void main(String[] args) {
        System.out.println(max(3, 7, 5));
        System.out.println(max(1.1, 9.9, 4.4));
        System.out.println(max("apple", "blueberry", "banana"));
    }
}
