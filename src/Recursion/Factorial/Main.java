package Recursion.Factorial;

public class Main {
    public static void main(String[] args) {
        int res = fact(5);
        System.out.println(res);

    }
    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        return n*fact(n-1);
    }
}
