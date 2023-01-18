package Arrays;

// Ques : 832. Flipping an image
// link : https://leetcode.com/problems/flipping-an-image/
import java.util.Arrays;

public class FlipAndInvertImage {
    public static void main(String[] args) {
        int[][] arr = {
                {1,1,0},
                {1,0,1},
                {0,0,0}
        };
        System.out.println(Arrays.deepToString(flipAndInvertImage(arr)));
    }
    static int[][] flipAndInvertImage(int[][] image) {
    int[][] flippedImage = new int[image.length][image[0].length];
    int[][] invertedImage = new int[image.length][image[0].length];
    // Flip the image horizontally
    for (int i = 0; i < image.length; i++) {
        for (int j = 0; j < image[i].length; j++) {
            flippedImage[i][j] = image[i][image[i].length - 1 - j];
        }
    }
    // Invert the image
    for (int i = 0; i < flippedImage.length; i++) {
        for (int j = 0; j < flippedImage[i].length; j++) {
            invertedImage[i][j] = flippedImage[i][j] == 0 ? 1 : 0;
        }
    }
    return invertedImage;
    }
}