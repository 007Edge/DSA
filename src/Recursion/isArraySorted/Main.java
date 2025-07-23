package Recursion.isArraySorted;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        boolean result = isSorted(0, arr);
        System.out.println(result);
    }
    public static boolean isSorted(int i, int[] arr) {
        if(i == arr.length-1) return true;
        if(arr[i] > arr[i+1]) return false;
        return isSorted(i+1, arr);
    }
}
