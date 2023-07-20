package Practice;

import java.util.*;

//link : https://www.hackerrank.com/challenges/diagonal-difference/problem?isFullScreen=true

public class DiagonalDifference {
    public static void main(String[] args) {
        List<List<Integer>> matrix = new ArrayList<>(List.of(
                List.of(1, 2, 3),
                List.of(4, 5, 6),
                List.of(9, 8, 9)
        ));
        System.out.println(diagonalDifference(matrix));
    }

    public static int diagonalDifference(List<List<Integer>> matrix) {
        int n = matrix.size(), primaryDiagonalSum = 0, secondaryDiagonalSum = 0;

        for (int i = 0; i < n; i++) {
            primaryDiagonalSum += matrix.get(i).get(i);
        }

        for (int i = 0; i < n; i++) {
            secondaryDiagonalSum += matrix.get(i).get(n - 1 - i);
        }

        return Math.abs(primaryDiagonalSum - secondaryDiagonalSum);
    }
}
