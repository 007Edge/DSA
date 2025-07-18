package Bit_Manipulation.PowerOfTwo;

public class Main {
    public static void main(String[] args) {
        if (check(17)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("Nope!");
        }
    }
    public static boolean check(int n) {
        n = n & (n-1);
        return n == 0;  // if n will be zero then true else false will be returned
    }
}


// NOTE: for numbers that are equal 2 to the power n => n & (n-1) == 0;