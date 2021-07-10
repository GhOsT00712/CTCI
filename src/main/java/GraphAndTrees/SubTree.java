package GraphAndTrees;

/**
 * To check is a given tree is sub tree of another
 *
 * @Time : O(nm)
 * @Space : O(lg(n) + lg(m))
 */
public class SubTree {

  public boolean isSubTree(TreeNode t1, TreeNode t2) {
    if (t2 == null) {
      return true;
    }
    if (t1 == null) {
      return false;
    }
    if (isSubTreeUtil(t1, t2)) {
      return true;
    }
    return isSubTree(t1.left, t2.right) || isSubTree(t2.right, t1.left);
  }

  private boolean isSubTreeUtil(TreeNode t1, TreeNode t2) {
    return (t1.data == t2.data) && isSubTreeUtil(t1.left, t2.left) && isSubTreeUtil(t1.right, t2.right);
  }
}
