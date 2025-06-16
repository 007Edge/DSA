package Sorting.InsertionSort;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 4, 1, 3, 2};
        int[] result = insertionSort(arr);
        for(int i: result) {
            System.out.print(i+" ");
        }
    }

    public static int[] insertionSort(int[] arr) {
        for (int i=1; i<arr.length; i++) {
            int curr = arr[i];
            int prev = i-1;
            // finding out the correct pos to insert
            while(prev >=0 && arr[prev] > curr) {
                arr[prev+1] = arr[prev];
                prev --;
            }
            // insertion
            arr[prev+1] = curr;
        }
        return arr;
    }
}

// time Complexity O(n2)