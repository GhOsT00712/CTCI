package GraphAndTrees;

/**
 * Validate if BinaryTree is BST
 */
public class BinaryTreeBST {

  TreeNode prev = null;

  public boolean isBST(TreeNode root) {
    if (root == null) {
      return true;
    }
    if (!isBST(root.left)) {
      return false;
    }
    if (prev != null && prev.data >= root.data) {
      return false;
    }
    prev = root;
    return isBST(root.right);
  }

}
