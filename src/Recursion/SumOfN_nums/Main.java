package Recursion.SumOfN_nums;

public class Main {
    public static void main(String[] args) {
        int result = sumOfN(5);
        System.out.println(result);

    }
    public static int sumOfN(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumOfN(n-1);
    }
}
