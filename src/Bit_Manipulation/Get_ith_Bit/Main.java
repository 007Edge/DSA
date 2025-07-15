package Bit_Manipulation.Get_ith_Bit;

public class Main {
    public static void main(String[] args) {
        int n = 10;
        int i = 2;

        System.out.println(getIthBit(n, i));
    }

    public static int getIthBit(int n, int i) {
        int bitMask = 1 << i;
        if((bitMask & n) == 0) {
            return 0;
        }
        else return 1;
    }
}

// git ith bit => (1<<i) & number  => if this expression results zero the bit is 0, else 1