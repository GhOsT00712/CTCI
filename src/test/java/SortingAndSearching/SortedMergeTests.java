package SortingAndSearching;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SortedMergeTests {

  SortedMerge sortedMerge;

  @Before
  public void setUp() {
    sortedMerge = new SortedMerge();
  }

  @Test
  public void testSortedMerge() {
    int[] arr1 = new int[25];
    for (int i = 0,j=0; i < 50; i = i + 2,j++) {
      arr1[j] = i;
    }
    int[] arr2 = new int[25];
    for (int i = 1,j=0; i < 50; i = i + 2,j++) {
      arr2[j] = i;
    }
    sortedMerge.mergeSortedArr(arr1,arr2);
    for (int i = 0; i < 50; i++) {
      Assert.assertEquals(i, sortedMerge.arr[i]);
    }
  }

}
