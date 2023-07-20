package Practice;

public class ReverseBinarySearch {
    public static void main(String[] args) {
        int[] arr = {99,79,66,54,42,36,22,12,10,7,4,0,-3,-12};
        int target = 10;
        System.out.println(search(arr, target));
    }
    public static int search(int[] arr, int target) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                start = mid + 1;
            } else if (target > arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }

        }
        return -1;
    }
}
