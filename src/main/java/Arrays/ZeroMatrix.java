package Arrays;

/**
 * If element in MxN matrix is 0 then entire row and col will be set to 0.
 *
 * @Time : O(MxN)
 * @Space : O(1)
 */
public class ZeroMatrix {

  public void getZeroMatrix(int[][] matrix) {
    int m = matrix.length;
    int n = matrix[0].length;

    boolean hasRowZero = false;
    boolean hasColZero = false;

    //check for first row if zero set hasRowZero = true;
    for (int i = 0; i < n; i++) {
      if (matrix[0][i] == 0) {
        hasRowZero = true;
        break;
      }
    }
    //check for first col if zero set hasColZero = true;
    for (int i = 0; i < m; i++) {
      if (matrix[i][0] == 0) {
        hasColZero = true;
        break;
      }
    }
    //check remaining matrix and set firstCol cell / row to 0 accordingly
    for (int i = 1; i < m; i++) {
      for (int j = 1; j < n; j++) {
        if (matrix[i][j] == 0) {
          matrix[i][0] = 0;
          matrix[0][j] = 0;
        }
      }
    }

    //set matrix cells to 0 based on its first cell
    for (int i = 1; i < m; i++) {
      for (int j = 1; j < n; j++) {
        if (matrix[i][0] == 0 || matrix[0][j] == 0) {
          matrix[i][j] = 0;
        }
      }
    }
    //set first row according to hasRowZero
    if (hasRowZero) {
      for (int i = 0; i < n; i++) {
        matrix[0][i] = 0;
      }
    }
    //set first col according to hasColZero
    if (hasColZero) {
      for (int i = 0; i < m; i++) {
        matrix[i][0] = 0;
      }
    }
  }
}
