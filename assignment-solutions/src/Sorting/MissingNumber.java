package Sorting;

// Ques : 268. Missing Number
// link : https://leetcode.com/problems/missing-number/
class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {0,1,3};
        System.out.println(missingNumber(arr));
    }
    public static int missingNumber(int[] arr) {
        // method 2
        int n = arr.length, ans = 0;
        int z = 0;
        int sum = n * (n + 1) / 2;

        for (int i : arr) {
            z = z + i;
        }
        ans = sum - z;
        return  ans;
    }

    // method 1
    //     int i = 0;

    // 	while (i < arr.length) {
    // 		int correct = arr[i];

    // 		if (arr[i] < arr.length && arr[i] != arr[correct]) {
    // 			swap(arr, i, correct);
    // 		} else {
    // 			i++;
    // 		}
    // 	}

    // 	for (int index = 0; index < arr.length; index++) {
    // 		if (arr[index] != index) {
    // 			return index;
    // 		}
    // 	}
    // 	return arr.length;
    // }

    // static void swap(int[] arr, int first, int second) {
    // 	int temp = arr[first];
    // 	arr[first] = arr[second];
    // 	arr[second] = temp;
    // }
}