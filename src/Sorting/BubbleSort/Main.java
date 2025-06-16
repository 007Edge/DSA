package Sorting.BubbleSort;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 4, 1, 3, 2};
        int[] result = BubbleSort(arr);
        for(int i: result) {
            System.out.println(i);
        }

    }
    public static int[] BubbleSort(int[] arr) {
        int n = arr.length;
        for (int i=0; i<arr.length-1; i++) {
            for (int j=0; j<n-1; j++) {
                int curr = arr[j];
                int next = arr[j+1];
                if (curr > next) {
                    arr[j]=next;
                    arr[j+1]=curr;
                }
            }
            n--;
        }
        return arr;
    }
}
// Logic moving largest element to end
