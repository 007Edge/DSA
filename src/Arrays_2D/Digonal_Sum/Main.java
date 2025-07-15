package Arrays_2D.Digonal_Sum;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,  2,  3},
                {5,  6,  7},
                {9,  10, 11}
        };

        printDigonalSum(matrix);

    }
    public static void printDigonalSum(int[][] matrix) {

        int n = matrix.length-1;

        int sum1 = 0;
        for(int i=0; i<=n; i++) {
            sum1 += matrix[i][i];
        }

        int sum2 = 0;
        for(int i=0; i<=n; i++) {
            if( i == n-i ) {     // test case => for nxn matrix where n is odd
                continue;
            }
            sum2+= matrix[i][n-i];

        }
        System.out.println(sum1+sum2);

    }

}
