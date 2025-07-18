package Bit_Manipulation.ClearRangeOfBits;

public class Main {
    public static void main(String[] args) {
        int result = clearRangeOfBits(10, 2, 4);
        System.out.println(result);
    }
    public static int clearRangeOfBits(int n, int i, int j) {
        int a = ~(-1 << i);
        int b = -1 << j+1;    // j is included that's why j+1
        int bitMask = a | b;
        return bitMask & n;
    }
}
