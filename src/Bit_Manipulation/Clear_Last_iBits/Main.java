package Bit_Manipulation.Clear_Last_iBits;

public class Main {
    public static void main(String[] args) {
        System.out.println(clearLast_iBit(7, 2));  // (number, iBits)
    }
    public static int clearLast_iBit(int n, int i) {
        int bitMask = -1 << i;
        return n & bitMask;
    }
}
