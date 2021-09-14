package LinearSearch;

public class MaxIn2DArray {
    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {1, 2, 3, 4},
                {33, 44, 15, 66},
                {12, 32, 56, 78, 97, 53}};
        System.out.println(Maximum(arr));
    }

    public static int Maximum(int[][] arr) {
        int max = -2147483648;

        for(int row = 0; row < arr.length; ++row) {
            for(int column = 0; column < arr[row].length; ++column) {
                if (arr[row][column] > max) {
                    max = arr[row][column];
                }
            }
        }
        return max;
    }
}