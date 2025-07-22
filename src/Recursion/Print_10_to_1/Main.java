package Recursion.Print_10_to_1;

public class Main {
    public static void main(String[] args) {
        printDec(10);
    }
    public static void printDec(int n) {
        if(n == 1) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printDec(n-1);

    }
}
