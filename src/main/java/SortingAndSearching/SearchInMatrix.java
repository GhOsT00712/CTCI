package SortingAndSearching;

/**
 * Search in Sorted Matrix.
 *
 * @Time :O(log(n))
 * @Space : O(1)
 */
public class SearchInMatrix {

  public int[] searchMatrix(int[][] matrix, int x) {
    int m = matrix.length;
    int n = matrix[0].length;
    int left = 0;
    int right = (m * n) - 1;

    while (left < right) {
      int mid = left + (right - left) / 2;
      int i = mid / n;
      int j = mid % n;

      if (x < matrix[i][j]) {
        right = mid - 1;
      } else if (x > matrix[i][j]) {
        left = mid + 1;
      } else {
        return new int[]{i, j};
      }
    }
    return new int[]{-1, -1};

  }
}
