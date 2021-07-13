package SortingAndSearching;

/**
 * Search in a rotated array
 *
 * @Time : O(Log(n))
 * @Space : O(1)
 */

public class SearchRotatedArr {

  public int searchSorted(int[] arr, int k) {
    int left = 0;
    int right = arr.length - 1;

    while (left < right) {
      int mid = left + (right - left) / 2;
      if (arr[mid] == k) {
        return mid;
      } else if (arr[left] <= arr[mid]) {
        if (k >= arr[left] && k < arr[mid]) {
          right = mid - 1;
        } else {
          left = mid + 1;
        }
      } else {
        if (k > arr[mid] && k <= arr[right]) {
          left = mid + 1;
        } else {
          right = mid - 1;
        }
      }
    }
    return arr[left] == k ? left : -1;
  }
}
