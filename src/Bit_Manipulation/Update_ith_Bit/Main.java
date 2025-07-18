package Bit_Manipulation.Update_ith_Bit;

public class Main {
    public static void main(String[] args) {
        int result = updateIthBit(9, 0, 0);
        // updateIthBit(number, ithBit, set | clear)

        System.out.println(result);
    }

    public static int updateIthBit(int n, int i, int bit) {
        if(bit == 1) {
            return setIthBit(n, i);
        }
        else {
            return clearIthBit(n, i);
        }
    }

    public static int setIthBit(int n, int i) {
        int bitMask = 1<<i;
        return bitMask | n;
    }

    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1<<i);
        return bitMask & n;
    }
}
