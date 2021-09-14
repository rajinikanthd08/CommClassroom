package LinearSearch;
public class FindMin {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, -4, 3, 4, 5, 6};
        System.out.println(Search(arr));
    }

    public static int Search(int[] arr) {
        int target = arr[0];

        for(int i = 1; i < arr.length; ++i) {
            if (target > arr[i]) {
                target = arr[i];
            }
        }
        return target;
    }
}