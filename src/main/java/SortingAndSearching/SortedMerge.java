package SortingAndSearching;

/**
 * Merge Array B to Array A.
 */
public class SortedMerge {

  public int[] arr;

  public SortedMerge() {
    arr = new int[100];
  }

  public void mergeSortedArr(int[] arr1, int[] arr2) {
    int left = 0;
    int right = 0;
    int curr = 0;
    while (left < arr1.length && right < arr2.length) {
      if (arr1[left] <= arr2[right]) {
        arr[curr] = arr1[left];
        left++;
      } else {
        arr[curr] = arr2[right];
        right++;
      }
      curr++;
    }
    while (right < arr2.length) {
      arr[curr] = arr2[right];
      right++;
      curr++;
    }
  }
}
