package day17;

public class AlternatingSum {

    public static int alternatingSum(int n) {
        if (n == 1) {
            return 1;
        } else if (n % 2 == 0) {
            return alternatingSum(n - 1) - n;
        } else {
            return alternatingSum(n - 1) + n;
        }
    }
}