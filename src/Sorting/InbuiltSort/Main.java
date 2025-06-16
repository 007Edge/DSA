package Sorting.InbuiltSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 4, 1, 3, 2};
        Arrays.sort(arr);
        for(int i: arr) {
            System.out.print(i+" ");
        }
    }
}

// Arrays.sort(arr, si, ei)    ei is not included.
// Arrays.sort(arr, si, ei, Collection.reverseOrder()); you need to use Integer class
// to reverse import java.util.Collections;
