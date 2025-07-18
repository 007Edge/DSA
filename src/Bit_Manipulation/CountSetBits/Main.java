package Bit_Manipulation.CountSetBits;

public class Main {
    public static void main(String[] args) {
        System.out.println(countBits(15));
    }
    public static int countBits(int n) {
        int count = 0;
        int bitMask = 1;
        while (n > 0) {
            if((bitMask & n) == 1) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }
}
