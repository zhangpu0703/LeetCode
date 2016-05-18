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
    public int rob(TreeNode root) {
        if (root == null) return 0;
        if (root.left != null && root.right!= null) {
            int left = rob(root.left.left)+rob(root.left.right);
            int right = rob(root.right.left)+rob(root.right.right);
            return Math.max((rob(root.left)+rob(root.right)),(left+right+root.val));
        }
        else if (root.left != null){
            int left = rob(root.left.left)+rob(root.left.right);
            return Math.max(rob(root.left),(left+root.val));
        }
        else if (root.right != null){
            int right = rob(root.right.left)+rob(root.right.right);
            return Math.max(rob(root.right),(right+root.val));
        }
        else return root.val;
    }
}