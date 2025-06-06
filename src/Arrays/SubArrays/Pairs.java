package Arrays.SubArrays;

public class Pairs {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        printPairs(arr);

    }
    public static void printPairs(int[] arr) {
        int noOfPair = 0;
        for (int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                System.out.print("("+arr[i]+", "+arr[j]+") ");
                noOfPair++;
            }


            System.out.println();
        }
        System.out.println(noOfPair);

        int n = arr.length;
        System.out.println(n*(n-1)/2);

    }
}

//      formula for printing pairs n(n-1)/2
