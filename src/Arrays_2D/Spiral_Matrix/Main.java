package Arrays_2D.Spiral_Matrix;

public class Main {
    public static void main(String[] args) {

        int[][] matrix = {
                {1,  2,  3,  4},
                {12, 13, 14, 5},
                {11, 16, 15, 6},
                {10, 9,  8,  7}
        };

        printMatrix(matrix);

    }
    public static void printMatrix(int[][] matrix) {

        int sr = 0;
        int sc = 0;
        int er = matrix.length-1;
        int ec = matrix[0].length-1;

        while (sr <= er && sc <= ec) {
            // upper boundary
            for(int i=sc; i<=ec; i++) {
                System.out.print(matrix[sr][i]+" ");
            }

            // right boundary
            for(int i=sr+1; i<=er; i++) {
                System.out.print(matrix[i][ec]+" ");
            }

            //bottom boundary
            for (int i=ec-1; i>=sc; i--) {
                if(sc == ec) break;
                System.out.print(matrix[er][i]+" ");
            }

            //left boundary
            for (int i=er-1; i>=sr+1; i--) {
                System.out.print(matrix[i][sc]+" ");
            }

            sr++;
            sc++;
            ec--;
            er--;
        }
    }
}


// works for nxm matrix