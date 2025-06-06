package Arrays.reverseArray;


public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] rev = reverseArray(arr);
        for (int i: rev) {
            System.out.print(i+" ");
        }


    }

    public static int[] reverseArray(int[] arr) {
        int si = 0;
        int ei = arr.length-1;

        while(si < ei) {
            int temp = arr[si];
            arr[si] = arr[ei];
            arr[ei] = temp;
            si++;
            ei--;
        }
        return arr;
    }
}

// used two pointer approach
// branch main