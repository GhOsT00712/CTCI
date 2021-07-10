package GraphAndTrees;

import java.util.HashMap;

/**
 * Determine count of path sum exist in a tree.
 *
 * @Time : O(n)
 * @Space : O(n)
 */
public class PathSum {

  HashMap<Integer, Integer> sumCountMap;
  int runningSum = 0;

  public PathSum() {
    sumCountMap = new HashMap<>();
    sumCountMap.put(0, 1);
  }

  public int getPathSumCounts(TreeNode node, int sum) {
    if (node == null) {
      return 0;
    }
    runningSum += node.data;
    int count = sumCountMap.getOrDefault(runningSum - sum, 0);
    sumCountMap.put(runningSum, count + 1);
    count += getPathSumCounts(node.left, sum) + getPathSumCounts(node.right, sum);
    sumCountMap.put(runningSum, sumCountMap.getOrDefault(runningSum, 0) - 1);
    return count;
  }
}
