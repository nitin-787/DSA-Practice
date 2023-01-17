package Arrays;

// Ques : 1732. Find the Highest Altitude
// link : https://leetcode.com/problems/find-the-highest-altitude/
// Solution : https://leetcode.com/problems/find-the-highest-altitude/solutions/3062457/beats-100-solution-easy-approach/
class LargestAltitude {
    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
        System.out.println((largestAltitude(gain)));
    }

    public static int largestAltitude(int[] gain) {
        int largest = 0;
        int[] arr = new int[gain.length + 1];
        arr[0] = 0; int i = 1;

        int j = 0;
        while (i <= gain.length) {
            arr[i] = gain[j] + arr[i - 1];
            i++;
            j++;
        }

        i = 0;

        while (i < arr.length) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
            i++;
        }
        return largest;
    }
}