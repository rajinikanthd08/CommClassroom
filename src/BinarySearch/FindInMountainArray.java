package BinarySearch;

public class FindInMountainArray {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,3,1};
        int target = 3;
        int answer = search(arr, target);
        System.out.println(answer);

    }

    public static int search(int[] arr, int target) {
        int peak = peakIndexInMountainArray(arr);
        int firstTry = OrderAgnostic(arr, target, 0, peak);
        if(firstTry != -1) {
            return firstTry;
        }
        else{
            return OrderAgnostic(arr, target, peak+1, arr.length-1);
        }

    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if(arr[mid] > arr[mid+1]) {             /// Descending Order
                end = mid;                          /// end can be the answer, but we have to look at left side also
            }
            else{
                start = mid + 1;                   /// This for mid < mid + 1 (Ascending Order)
            }
        }
        return end;                               /// start == end so, we can return anything as both the checks are pointing to one element only
    }

    public static int OrderAgnostic(int[] arr, int target, int start, int end) {

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
