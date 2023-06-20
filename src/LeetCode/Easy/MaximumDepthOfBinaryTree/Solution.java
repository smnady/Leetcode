package LeetCode.Easy.MaximumDepthOfBinaryTree;

public class Solution {
    public static int maxDepth(TreeNode root) {
        return result(root, 0, 0);
    }
    public static int result(TreeNode root, int level, int res) {
        if (root==null) {
            res = (level>res) ? level : res;
            return res;
        }
        if (root!=null) {
            res = result(root.right, level+1, res);
        }
        if (root!=null) {
            res = result(root.left, level+1, res);
        }
        return res;
    }

    public static void main(String[] args) {
        TreeNode four = new TreeNode(7);
        TreeNode tree = new TreeNode(21, null, null);
        TreeNode two = new TreeNode(13, four, null);
        TreeNode t1 = new TreeNode(15, two, tree);
        System.out.println(maxDepth(t1));
    }
}
 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
