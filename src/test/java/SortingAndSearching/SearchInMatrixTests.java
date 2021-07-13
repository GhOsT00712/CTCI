package SortingAndSearching;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SearchInMatrixTests {

  SearchInMatrix searchInMatrix;

  @Before
  public void setUp() {
    searchInMatrix = new SearchInMatrix();
  }

  @Test
  public void testsSearchInMatrix() {
    int[][] matrix = new int[][]{{0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
        {10, 11, 12, 13, 14, 15, 16, 17, 18, 19}, {20, 21, 22, 23, 24, 25, 26, 27, 28, 29}};
    int[] result = searchInMatrix.searchMatrix(matrix, 16);
    Assert.assertEquals(1, result[0]);
    Assert.assertEquals(6, result[1]);
  }
}
