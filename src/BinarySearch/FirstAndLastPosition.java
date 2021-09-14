package BinarySearch;
import java.util.Arrays;

public class FirstAndLastPosition {

    public static void main(String[] args) {
        int[] nums = new int[]{5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] answer = searchRange(nums, target);
        System.out.println(Arrays.toString(answer));
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] answer = new int[]{-1, -1};
        int start = search(nums, target, true);
        int end = search(nums, target, false);
        answer[0] = start;
        answer[1] = end;
        return answer;
    }

    public static int search(int[] nums, int target, boolean FirstStartIndex) {
        int start = 0;
        int end = nums.length - 1;
        int answer = -1;

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (target > nums[mid]) {
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                answer = mid;
                if (FirstStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return answer;
    }
}