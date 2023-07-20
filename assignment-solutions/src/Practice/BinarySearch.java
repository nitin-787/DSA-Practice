package Practice;

// https://leetcode.com/problems/binary-search/

class BinarySearch {
	public static void main(String[] args) {
		int[] arr = {-12,-3,0,4,7,10,12, 22,36,42,54,66,79,99};
		int target = 10;
		System.out.println(search(arr, target));
	}
    public static int search(int[] arr, int target) {
		int start = 0, end = arr.length - 1;

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