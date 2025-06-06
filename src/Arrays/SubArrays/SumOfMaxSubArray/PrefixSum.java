package Arrays.SubArrays.SumOfMaxSubArray;

public class PrefixSum {
    public static void main(String[] args) {
        int[] arr = {1, -2, 6, -1, 3};
        int max = sum(arr);
        System.out.println(max);
    }
    public static int sum(int[] arr) {
        int max = -1000;
        int[] prefix = new int[arr.length];

        // prefix array
        for (int i=0; i<arr.length; i++) {
            if (i==0) {
                prefix[i]=arr[i];
            }
            else {
                prefix[i]=arr[i]+prefix[i-1];
            }
        }

        for(int i=0; i<arr.length; i++) {
            for(int j=i; j<arr.length; j++) {
                int curr;
                if (i==j) {
                    curr = arr[i];
                }
                else if (i==0) {
                    curr = prefix[j];
                }
                else {
                    curr = prefix[j]-prefix[i-1];
                }
                if (max < curr) {
                    max = curr;
                }
            }
        }
        return max;
    }
}
