package Recursion.PowerOfX;

public class Main {
    public static void main(String[] args) {
        int result = find(5, 3);
        System.out.println(result);
    }
    public static int find(int x, int n) {
        if (n == 1) return x;
        return x*find(x, n-1);
    }
}
