package LeetCode.Easy.MinimumDepthOfBinaryTree;

import LeetCode.Data.TreeNode;

public class Solution {
    public static int minDepth(TreeNode root) {
        if (root == null) return 0;
        return minD(root, Integer.MAX_VALUE, 1);
    }
    static int minD(TreeNode root, int min, int level) {
        if (root.left==null && root.right == null) {
            return (min < level) ? min : level;
        }
        if (root.right!=null) min = minD(root.right, min, level+1);
        if (root.left!=null) min = minD(root.left, min, level+1);
        return min;
    }
    public static void main(String[] args) {
        TreeNode four = new TreeNode(7);
        TreeNode tree = new TreeNode(21, null, null);
        TreeNode two = new TreeNode(13, four, null);
        TreeNode t1 = new TreeNode(15, two, tree);
        System.out.println(minDepth(t1));
    }
}
