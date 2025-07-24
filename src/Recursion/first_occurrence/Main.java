package Recursion.first_occurrence;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 54, 43, 2, 4};
        int idx = find(4, arr, 0);
        System.out.println(idx);
    }
    public static int find(int key, int[] arr, int i) {
        if (i == arr.length) return -1;
        if (arr[i] == key) return i;
        return find(key, arr, i+1);
    }
}
