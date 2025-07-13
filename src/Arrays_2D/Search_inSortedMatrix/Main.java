package Arrays_2D.Search_inSortedMatrix;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
                {10,20,30,40},
                {15,25,35,45},
                {27,29,37,48},
                {32,33,39,50}
        };

        int key = 54;
        search(matrix, key);

    }
    public static void search(int[][] matrix, int key) {

        int j = matrix[0].length-1;
        int i = 0;

        boolean isFound = false;

        while( i<=matrix.length-1 && j>=0 ) {
            if(matrix[i][j]==key) {
                System.out.println("row:"+i+" column:"+j);
                isFound = true;
                break;
            }
            if(matrix[i][j] > key) {
                j--;
            } else if (matrix[i][j] < key) {
                i++;
            }
        }

        if(!isFound) {
            System.out.println("key is not in the matrix");
        }

    }
}

// i: row, j: column
// algo: if cell value is > key => move to the left cell
// and if cell value is < key => move down