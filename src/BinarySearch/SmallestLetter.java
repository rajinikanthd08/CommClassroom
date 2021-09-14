package BinarySearch;

public class SmallestLetter {

    public static void main(String[] args) {
        char[] arr = new char[]{'c', 'f', 'j'};
        char target = 'g';
        char answer = Smallest(arr, target);
        System.out.println(answer);
    }

    public static char Smallest(char[] Letters, char target) {
        int start = 0;
        int end = Letters.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (target < Letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return Letters[start % Letters.length];
    }
}