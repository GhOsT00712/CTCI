package SortingAndSearching;

import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestNoSizeSearch {

  NoSizeSearch noSizeSearch;

  @Before
  public void setUp() {
    noSizeSearch = new NoSizeSearch();
  }

  @Test
  public void testNoSizeSearch() {
    List<Integer> list = new ArrayList<>();

    list.add(1);
    list.add(10);
    list.add(20);
    list.add(30);
    list.add(-1);
    list.add(-1);
    list.add(-1);
    list.add(-1);

    Assert.assertEquals(2, noSizeSearch.searchNoSize(list, 20));
  }
}
