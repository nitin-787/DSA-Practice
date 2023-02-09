package Searching;

// Ques : 1351. Count Negative Numbers in a Sorted Matrix
// link : https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/
class CountNegatives {
    public static void main(String[] args) {
        int[][] arr = {
                {4, 3, 2, -1},
                {3, 2, 1, -1},
                {1, 1, -1, -2},
                {-1, -1, -2, -3}
        };
        System.out.println(countNegatives(arr));
    }
    static int countNegatives(int[][] grid) {
        int m = grid.length;
    int n = grid[0].length;
    int count = 0;
    int row = 0;
    int col = n - 1;
    
    while (row < m && col >= 0) {
        if (grid[row][col] < 0) {
            count += (m - row);
            col--;
        } else {
            row++;
        }
    }
    return count;
    }
}