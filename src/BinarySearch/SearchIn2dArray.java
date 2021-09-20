package BinarySearch;
import java.util.Arrays;

public class SearchIn2dArray {
    public static void main(String[] args) {
        int[][] matrix =
                {
                  {1 , 2,  3, 4  },
                  {5 , 6,  7,   8},
                  {9, 10, 11,  12},
                  {13, 14, 15, 16}
                };

        System.out.println(Arrays.toString(Search(matrix, 15)));

    }

    public static int[] Search(int[][] matrix, int target) {
        int row = 0;
        int column = matrix.length - 1;

    while (row < matrix.length && column >= 0 ) {

        if(matrix[row][column] == target) {
            return new int[] {row, column};
        }
        if(matrix[row][column] > target) {
            column--;
        }
        else{
            row++;
        }
    }
    return new int[] {-1, -1};
  }
}
