package SortingAndSearching;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SearchRotatedArrTests {

  SearchRotatedArr searchRotatedArr;

  @Before
  public void setUp() {
    searchRotatedArr = new SearchRotatedArr();
  }

  @Test
  public void TestSearchRotated() {
    int[] arr = {5, 6, 7, 8, 1, 2, 3, 4};

    Assert.assertEquals(2, searchRotatedArr.searchSorted(arr, 7));
  }

}
