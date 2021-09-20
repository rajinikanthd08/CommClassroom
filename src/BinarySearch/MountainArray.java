package BinarySearch;

public class MountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,4,2,1,1};
        int answer = peakIndexInMountainArray(arr);
        System.out.println(answer);
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
}
