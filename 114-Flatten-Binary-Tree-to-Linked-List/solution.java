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
        TreeNode r = root.right;
        TreeNode l = root.left;
        flatten(l);
        root.right = l;
        root.left = null;
        TreeNode cur =root;
        while (cur.right != null) cur=cur.right;
        cur.right = r;
        flatten(r);
    }
}