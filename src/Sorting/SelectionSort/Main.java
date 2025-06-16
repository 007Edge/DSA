package Sorting.SelectionSort;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 4, 1, 3, 2};
        int[] result = selectionSort(arr);
        for(int i: result) {
            System.out.print(i+" ");
        }
    }

    public static int[] selectionSort(int[] arr) {
        for (int i=0; i<arr.length-1; i++) {
            int curr = arr[i];
            int s = Integer.MAX_VALUE;
            int idx = 0;
            for(int j=i+1; j<arr.length; j++) {
                if(s > arr[j]) {
                    s = arr[j];
                    idx = j;
                }
            }
            if (curr > s) {
                arr[i] = s;
                arr[idx] = curr;
            }
        }
        return arr;
    }
}
// Logic: picking the smallest element and replacing it with current
// time complexity O(n2)