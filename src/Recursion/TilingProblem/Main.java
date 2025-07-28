package Recursion.TilingProblem;

public class Main {
    public static int tilingProblem(int n) {
        if (n == 0 || n==1) {
            return 1;
        }
        int fnm1 = tilingProblem(n-1);
        int fnm2 = tilingProblem(n-2);

        return fnm1+fnm2;
    }
    public static void main(String[] args) {
        System.out.println(tilingProblem(4));
    }
}
