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
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        int diff=Math.abs(height(root.left)-height(root.right));
        if (diff>1) return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }
    public int height(TreeNode root){
        if (root==null) return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
}