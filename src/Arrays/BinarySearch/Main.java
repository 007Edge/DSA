package Arrays.BinarySearch;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4 , 13, 32, 40, 99, 102, 410};
        int Idx = findIdx(arr , 4);
        System.out.println(Idx);
    }
    public static int findIdx(int[] arr, int key) {

        int si = 0;
        int ei = arr.length-1;
        int curr;

        while (si <= ei) {

            curr = (si + ei)/2;
            if (arr[curr] == key) {
                return curr;
            }
            if (arr[curr] > key) {

                ei = curr-1;
            }
            if (arr[curr] < key) {
                si = curr+1;
            }
        }


        return -1;
    }
}
