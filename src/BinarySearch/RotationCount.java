package BinarySearch;

public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2, 3};
        int answer = Count(arr);
        System.out.println(answer);

    }

    public static int Count(int[] arr) {
        int pivot = FindPivot(arr);
        return pivot + 1;
    }

    public static int FindPivot(int[] nums) {                // use for non duplicates

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
            if (nums[mid] <= nums[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
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

    // use for duplicates
 /*   public static int FindPivotWithDuplicates(int[] nums) {

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
    }*/

