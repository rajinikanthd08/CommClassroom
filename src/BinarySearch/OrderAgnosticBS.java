package BinarySearch;
public class OrderAgnosticBS {

    public static void main(String[] args) {
        int[] arr = new int[]{-18, -12, -4, 0, 1, 3, 4, 6, 7, 9, 10, 12, 15, 66, 77, 78, 89, 90};
        int target = 15;
        int answer = OrderAgnostic(arr, target);
        System.out.println(answer);
    }

    public static int OrderAgnostic(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else if (target < arr[mid]) {
                    end = mid - 1;
                }
            } else if (target < arr[mid]) {
                start = mid + 1;
            } else if (target > arr[mid]) {
                end = mid - 1;
            }
        }

        return -1;
    }
}