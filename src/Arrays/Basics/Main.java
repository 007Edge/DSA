package Arrays.Basics;

public class Main {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1, 5};
        printArray(arr);
        int idx = findIdx(arr, 3);
        System.out.println("idx found: "+ idx);
        int max = findMax(arr);
        System.out.println("Maximum: "+max);

    }
    public static void printArray(int[] arr) {
        for(int i: arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static int findIdx(int[] arr, int val) {
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == val) {
                return i;
            }
        }
        return -1;  // if key not found returning -1
    }
    public static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i=0; i<arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}

// Topic covered
// arrays, liner-search, largest in array, passing array as argument.
