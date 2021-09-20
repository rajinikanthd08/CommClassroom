package BinarySearch;

public class RSADuplicate {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        int answer = search(nums, target);
        System.out.println(answer);
    }

    public static int search(int[] nums, int target) {
        int pivot = FindPivotWithDuplicates(nums);

        // Check the searched pivot condition and if pivot == -1, it means that the array is not rotated
        // if the array is not rotating then do the normal binary search

        if (pivot == -1) {
            return BinarySearch(nums, target, 0, nums.length - 1);
        }

        // if pivot != -1, it means we have found pivot with 2 asc sub sorted array
        if (nums[pivot] == target) {
            return pivot;
        }

        if (target >= nums[0]) {                    // if start < target then only look for 1 asc sub sorted array which 0 to pivot-1
            return BinarySearch(nums, target, 0, pivot - 1);
        }
        return BinarySearch(nums, target, pivot + 1, nums.length - 1);  // if start > target then only look for 1 asc sub sorted array which pivot+1 to length of array
    }

    public static int FindPivotWithDuplicates(int[] nums) {

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Write all the 4 conditions to find the Pivot element
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }
         // Duplicate code starts from here
         // if start == mid == end then skip the duplicates
            if(nums[mid] == nums[start] && nums[mid] == nums[end] ) {
                // but if start or end might be pivot then we should check the condition for that too!
                if(nums[start] > nums[start+1]) {            // if start is pivot
                    return start;
                }
                start++;

                if(nums[end] > nums[end-1]) {       // if end is pivot
                    return end-1;
                }
                end--;
            }

            // left side is sorted so pivot might be on the right side
            else if(nums[start] < nums[mid] || (nums[start] == nums[mid] && nums[mid] > nums[end])) {

                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }

    public static int BinarySearch(int[] arr, int target, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
