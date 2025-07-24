package Recursion.PowerOfX;

public class Optimize {
    public static void main(String[] args) {
        int result = find(2, 7);
        System.out.println(result);
    }
    public static int find(int x, int n) {
        if (n==0) {
            return 1;
        }
        if(n%2 == 0) {
            return find(x, n/2) * find(x, n/2);
        }
        else {
            return x*find(x, n/2) * find(x, n/2);
        }
    }
}
