package GraphAndTrees;

/**
 * Find a inorder successor of BST
 */
public class BSTSuccessor {

  public TreeNode getInOrderSuccessor(TreeNode root, TreeNode node) {
    if (root == null) {
      return null;
    }
    if (node.right != null) {
      return findMin(node.right);
    }
    TreeNode succ = null;
    while (root != null) {
      if (node.data < root.data) {
        succ = root;
        root = root.left;
      } else if (node.data > root.data) {
        root = root.right;
      } else {
        break;
      }
    }
    return succ;
  }

  private TreeNode findMin(TreeNode node) {
    while (node.left != null) {
      node = node.left;
    }
    return node;
  }
}
