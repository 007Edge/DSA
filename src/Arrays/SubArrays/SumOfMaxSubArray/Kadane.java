package Arrays.SubArrays.SumOfMaxSubArray;

public class Kadane {
    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        int max = sum(arr);
        System.out.println(max);
    }

    public static int sum(int[] arr) {
        int max = -100000;
        int cs = 0;
        for (int i : arr) {
            cs += i;
            if (cs < 0) {
                cs = 0;
            }
            if (max < cs) {
                max = cs;
            }
        }

        return max;
    }
}


// remember:  (+a) + (+b) = +ve   usable
// where a>b  (+a) + (-b) = +ve   usable
// where b>a  (+a) + (-b) = -ve   reject
