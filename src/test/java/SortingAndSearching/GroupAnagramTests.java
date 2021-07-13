package SortingAndSearching;

import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GroupAnagramTests {

  GroupAnagrams groupAnagrams;

  @Before
  public void setUp() {
    groupAnagrams = new GroupAnagrams();
  }

  @Test
  public void testGroupAnagrams() {
    ArrayList<String> list = new ArrayList<>();
    list.add("hello");
    list.add("cool");
    list.add("llohe");
    list.add("loleh");
    list.add("dog");
    list.add("god");
    List<List<String>> result = groupAnagrams.groupAnagrams(list);
    Assert.assertEquals(3, result.size());
  }
}
