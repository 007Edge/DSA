package Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1, 5};
        printArray(arr);
        int idx = findIdx(arr, 1);
        System.out.println(idx);

    }
    public static void printArray(int[] arr) {
        for(int i: arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static int findIdx(int[] arr, int val) {
        for (int i: arr) {
            if (val == arr[i]) {
                return i;
            }
        }
        return -1;  // if key not found returning -1
    }
}

// array creation, passing array to function as argument
