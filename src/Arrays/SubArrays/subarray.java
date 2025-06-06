package Arrays.SubArrays;

public class subarray {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        int ts = 0;  // total subarrays

        for (int i=0; i<arr.length; i++) {
            for (int j=i; j<arr.length; j++) {
                for (int k=i; k<=j; k++) {
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
                ts++;
            }
            System.out.println();
        }

        System.out.println("Total Subarrays: "+ts);
        System.out.println();

        // Total subarray formula n*(n+1)/2 ,  n is length of array
    }
}
