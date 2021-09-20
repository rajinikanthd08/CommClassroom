package BinarySearch;

public class RotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        System.out.println(FindPivot(nums));
        int target = 0;
        int answer = search(nums, target);
        System.out.println(answer);
    }

    public static int search(int[] nums, int target) {
        int pivot = FindPivot(nums);

        // Check the searched pivot condition and if pivot == -1, it means that the array is not rotated
        // if the array is not rotating then do the normal binary search

        if(pivot == -1) {
            return BinarySearch(nums, target, 0, nums.length-1);
        }

        // if pivot != -1, it means we have found pivot with 2 asc sub sorted array
        if(nums[pivot] == target) {
            return pivot;
        }

        if(target >= nums[0]) {                    // if start < target then only look for 1 asc sub sorted array which 0 to pivot-1
            return BinarySearch(nums, target, 0, pivot-1);
        }
            return BinarySearch(nums, target, pivot+1, nums.length-1);  // if start > target then only look for 1 asc sub sorted array which pivot+1 to length of array
    }

    public static int FindPivot(int[] nums) {

        int start = 0;
        int end = nums.length-1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Write all the 4 conditions to find the Pivot element
            if(mid < end && nums[mid] > nums[mid+1]) {
                return mid;
            }
            if(mid > start && nums[mid] < nums[mid-1]) {
                return mid-1;
            }
            if(nums[mid] <= nums[start]) {
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
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
