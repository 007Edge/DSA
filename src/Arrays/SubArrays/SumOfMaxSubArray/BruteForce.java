package Arrays.SubArrays.SumOfMaxSubArray;

public class BruteForce {
    public static void main(String[] args) {
        int[] arr = {1, -2, 6, -1, 3};
        int max = sumSA(arr);
        System.out.println(max);
    }

    public static int sumSA(int[] arr) {
        int max = -100000;
        for(int i=0; i<arr.length; i++) {
            for(int j=i; j<arr.length; j++) {
                int curr = 0;
                for(int k=i; k<=j; k++) {
                    curr+=arr[k];
                }
                if (max < curr) {
                    max = curr;
                }
            }
        }
        return max;
    }
}
