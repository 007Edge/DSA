package Recursion.last_occurrence;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 3, 43, 4, 34, 5, 3, 4, 2};
        int idx = find(arr, 3, 0);
        System.out.println(idx);
    }
    public static int find(int[] arr, int key, int i) {
        if(arr.length == i) {
            return -1;
        }
        int isFound =  find(arr, key, i+1);

        if(isFound == -1 && key == arr[i]) {
            return i;
        }
        return isFound;

    }
}
