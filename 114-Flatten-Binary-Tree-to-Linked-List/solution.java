/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void flatten(TreeNode root) {
        if (root == null) return;
        TreeNode left = root.left, right = root.right;
        flatten(left);
        root.right = left;
        root.left = null;
        TreeNode cur = root;
        while (cur.right != null) cur = cur.right;
        flatten(right);
        cur.right = right;
    }
}