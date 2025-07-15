package Bit_Manipulation.Set_ith_Bit;

public class Main {
    public static void main(String[] args) {
        int n = 10;
        int i = 2;

        System.out.println(setIthBit(n, i));
    }
    public static int setIthBit(int n, int i) {
        int bitMask = 1<<i;
        return n | bitMask;
    }
}

// to setIth bit => (1 << i) | n  => now on ith bit is 1;
