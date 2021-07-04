package GraphAndTrees;

/**
 * To determine is given tree is balanced
 */
public class TreeBalanced {

  Boolean isBalanced = true;

  public boolean isTreeBalanced(TreeNode root) {
    if (root == null) {
      return isBalanced;
    }
    isTreeBalancedUtil(root);
    return isBalanced;
  }

  private int isTreeBalancedUtil(TreeNode root) {
    if (root == null) {
      return 0;
    }
    int leftHeight = isTreeBalancedUtil(root.left);
    int rightHeight = isTreeBalancedUtil(root.right);
    if (Math.abs(leftHeight - rightHeight) > 1) {
      isBalanced = false;
    }
    return Math.max(leftHeight, rightHeight) + 1;
  }
}
