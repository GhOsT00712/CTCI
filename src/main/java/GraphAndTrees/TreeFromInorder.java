package GraphAndTrees;

/**
 * Create a Tree from given Inorder traversal
 */
public class TreeFromInorder {


  public TreeNode getTreeFromInorder(int[] arr) {
    return createTreeFromInorderUtil(arr, 0, arr.length - 1);
  }

  private TreeNode createTreeFromInorderUtil(int[] arr, int l, int r) {
    if (l > r) {
      return null;
    }
    int mid = l + (r - l) / 2;
    TreeNode node = new TreeNode(arr[mid]);
    node.left = createTreeFromInorderUtil(arr, l, mid - 1);
    node.right = createTreeFromInorderUtil(arr, mid + 1, r);
    return node;
  }
}
