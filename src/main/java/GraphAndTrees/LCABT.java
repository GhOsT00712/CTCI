package GraphAndTrees;

/**
 * Find LCA in Binary tree
 */
public class LCABT {

  public TreeNode getLCABT(TreeNode t1, TreeNode t2, TreeNode root) {
    if (root == null) {
      return null;
    }
    if (t1 == root) {
      return t1;
    }
    if (t2 == root) {
      return t2;
    }
    TreeNode leftSubTree = getLCABT(t1, t2, root.left);
    TreeNode rightSubTree = getLCABT(t1, t2, root.right);
    if (leftSubTree != null && rightSubTree != null) {
      return root;
    }
    if (leftSubTree == null) {
      return rightSubTree;
    } else {
      return leftSubTree;
    }
  }
}
