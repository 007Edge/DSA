package Bit_Manipulation.Clear_ith_Bit;

public class Main {
    public static void main(String[] args) {
        int i = 1;
        int n = 10;
        System.out.println(clearIthBit(n, i));
    }
    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1<<i);
        return n & bitMask; 
    }
}
