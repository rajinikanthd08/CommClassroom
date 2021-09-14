package LinearSearch;
import java.util.Arrays;

public class SearchIn2DArray {

    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 2, 3, 4}, {33, 44, 15, 66}, {12, 32, 56, 78, 97, 53}};
        int target = 15;
        int[] answer = search(arr, target);
        System.out.println(Arrays.toString(answer));
    }

    public static int[] search(int[][] arr, int target) {
        for(int row = 0; row < arr.length; ++row) {
            for(int column = 0; column < arr[0].length; ++column) {
                if (arr[row][column] == target) {
                    return new int[]{row, column};
                }
            }
        }

        return new int[]{-1, -1};
    }
}