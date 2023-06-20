package LeetCode.Easy.SymmetricTree;
import LeetCode.Data.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static boolean isSymmetric(TreeNode root) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        toList(root.right, l1, 1);
        toList(root.left, l2, 0);
        System.out.println(l1);
        System.out.println(l2);
        return l1.equals(l2);
    }
    public static void toList(TreeNode root, List<Integer> list, int LorR) {
        if (LorR==0) {
            if (root == null) {
                list.add(-201);
                return;
            }
            else list.add(root.val);
            toList(root.left, list, LorR);
            toList(root.right, list, LorR);
        }
        if (LorR==1) {
            if (root == null) {
                list.add(-201);
                return;
            }
            else list.add(root.val);
            toList(root.right, list, LorR);
            toList(root.left, list, LorR);
        }
    }
    public static void main(String[] args) {
        TreeNode four = new TreeNode(3);
        TreeNode tree = new TreeNode(2, null, new TreeNode(3));
        TreeNode two = new TreeNode(2, four, null);
        TreeNode t1 = new TreeNode(1, two, tree);
        System.out.println(isSymmetric(t1));
    }
}
