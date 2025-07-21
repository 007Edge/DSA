package Bit_Manipulation.Fast_Exponentiation;

public class Main {
    public static void main(String[] args) {
        int result = fastExpo(2, 3);
        System.out.println(result);
    }
    public static int fastExpo(int a, int n) {
        int ans = 1;
        while (n>0) {
            if((n & 1) != 0) {
                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;
        }
        return ans;
    }
}
