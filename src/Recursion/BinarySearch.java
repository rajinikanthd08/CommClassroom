package Recursion;

public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = {3,4,7,9,10,12,15,18,21,24,54,67,78,89,90};
        int target = 21;
        int answer = BS(arr, target, 0, arr.length-1);
        System.out.println(answer);
    }

    public static int BS(int[] arr, int target, int start, int end) {

        if(start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if(arr[mid] == target) {
            return mid;
        }

        if(arr[mid] > target) {
            return BS(arr, target, start, mid - 1);
        }
        return BS(arr, target, mid + 1, end);
    }
}
