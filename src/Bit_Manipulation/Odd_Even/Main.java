package Bit_Manipulation.Odd_Even;

public class Main {
    public static void main(String[] args) {

        boolean result = isEvenOdd(7);

        if(result) {
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }
    }

    public static boolean isEvenOdd(int num) {
        int bitMask = 1;
        return (num & bitMask) == 0;
    }
}
