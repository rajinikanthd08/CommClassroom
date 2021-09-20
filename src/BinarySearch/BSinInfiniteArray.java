package BinarySearch;

public class BSinInfiniteArray {
    public static void main(String[] args) {

        int[] arr = {1,3,5,7,9,10,13,15,22,25,27,32,36,41,49,50};
        int target = 10;
        int answer = FindAnswer(arr, target);
        System.out.println(answer);

    }

    public static int FindAnswer(int[] arr, int target) {
        int start = 0;
        int end = 1;

        while(target > arr[end]) {
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;   // end = previous end + (size of box + 1) * 2
            start = newStart;
        }
        return BinarySearch(arr, target, start, end);
    }

    public static int BinarySearch(int[] arr, int target, int start, int end) {

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]){
                end = mid - 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
