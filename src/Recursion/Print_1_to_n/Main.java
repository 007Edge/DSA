package Recursion.Print_1_to_n;

public class Main {
    public static void main(String[] args) {
        printInc(14);
    }
    public static void printInc(int n) {
        if(n == 1) {
            System.out.println(1);
            return;
        }
        printInc(n-1);
        System.out.println(n);
    }
}
