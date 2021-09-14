package LinearSearch;
public class NormalSearching {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        int key = 4;

        for(int i = 0; i < arr.length; ++i) {
            if (arr[i] == key) {
                System.out.println(arr[i]);
            } else {
                System.out.println("Not Found");
            }
        }
    }
}