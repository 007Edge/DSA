package Sorting.CountingSort;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 4, 1, 3, 2, 4, 3, 7};

        int[] result = countingSort(arr);

        for(int i: result) {
            System.out.print(i+" ");
        }

    }
    public static int[] countingSort(int[] arr) {
        //Max element
        int max = Integer.MIN_VALUE;

        for(int i: arr) {
            max = Math.max(i,max);
        }

        // storing frequency
        int[] count = new int[arr.length];

        for (int i: arr) {
            count[i]++;
        }

        // sorting
        int j = 0;
        for (int i=0; i<count.length; i++) {
            while(count[i]>0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
        return arr;
    }
}
