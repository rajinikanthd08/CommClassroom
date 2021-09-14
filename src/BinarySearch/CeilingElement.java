package BinarySearch;

public class CeilingElement {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 4, 7, 12, 33, 45, 68, 87};
        int target = 6;
        int answer = Ceiling(arr, target);
        System.out.println(answer);
    }

    public static int Ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else {
                if (target >= arr[mid]) {
                    return mid;
                }

                end = mid - 1;
            }
        }

        return start;
    }
}