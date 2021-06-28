package Arrays;

/**
 * Rotate image (matrix) by 90 deg
 *
 * @Time : O(MxN)
 * @Space : O(1)
 */
public class RotateMatrix {

  public void Rotate90(int[][] matrix) {
    int m = matrix.length;
    int n = matrix[0].length;

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        //transpose;
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;


      }
    }

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n/2; j++) {
        // reverse by column
        int temp = matrix[i][j];
        matrix[i][j] = matrix[i][n - j - 1];
        matrix[i][n - j - 1] = temp;
      }
    }

  }
}
