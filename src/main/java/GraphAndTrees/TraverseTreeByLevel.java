package GraphAndTrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Level Order traversal of Tree
 */
public class TraverseTreeByLevel {

  public List<LinkedList<Integer>> getListByTreeLevel(TreeNode root) {
    List<LinkedList<Integer>> list = new ArrayList<>();
    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);
    while (!queue.isEmpty()) {
      int size = queue.size();
      LinkedList<Integer> levelList = new LinkedList<>();
      for (int i = 0; i < size; i++) {
        TreeNode node = queue.poll();
        if (node != null) {
          levelList.add(node.data);
          if (node.left != null) {
            queue.offer(node.left);
          }
          if (node.right != null) {
            queue.offer(node.right);
          }
        }
      }
      list.add(levelList);
    }
    return list;
  }
}
