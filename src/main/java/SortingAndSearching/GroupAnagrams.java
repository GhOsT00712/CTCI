package SortingAndSearching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * To sort a list of strings according to their anagrams
 *
 * @Time : O(N)
 * @Space : O(N)
 */
public class GroupAnagrams {

  public List<List<String>> groupAnagrams(ArrayList<String> list) {
    List<List<String>> groupAnagramList = new ArrayList<>();
    Map<String, List<String>> mapToAnagram = new HashMap<>();
    for (String s : list) {
      String key = getAnagramKey(s);
      List<String> anagramList = mapToAnagram.getOrDefault(key, new ArrayList<>());
      anagramList.add(s);
      mapToAnagram.put(key, anagramList);
    }
    for (Map.Entry<String, List<String>> entry : mapToAnagram.entrySet()) {
      groupAnagramList.add(entry.getValue());
    }
    return groupAnagramList;
  }

  private String getAnagramKey(String s) {
    int[] fv = new int[26];
    for (char c : s.toCharArray()) {
      fv[c - 'a']++;
    }
    return Arrays.toString(fv);
  }
}
