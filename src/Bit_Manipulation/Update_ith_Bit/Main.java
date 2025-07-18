package Bit_Manipulation.Update_ith_Bit;

public class Main {
    public static void main(String[] args) {
        int result = updateIthBit(9, 2, 1);
        // updateIthBit(number, ithBit, set | clear)

        System.out.println(result);
        System.out.println(update(9, 2, 1));
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

    public static int update(int n, int i, int bit) {
        n = clearIthBit(n, i);
        bit = bit << i;
        return bit | n;

    }
}
