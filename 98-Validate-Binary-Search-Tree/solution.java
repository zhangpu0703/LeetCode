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
    public boolean isValidBST(TreeNode root) {
        long max = Long.MAX_VALUE, min = Long.MIN_VALUE;
        return helper(root,max,min);
    }
    public boolean helper(TreeNode root, Long max, Long min){
        if (root == null) return true;
        if (root.val>= max || root.val<=min) return false;
        return helper(root.left,(long)root.val,min) && helper(root.right,max,(long)root.val);
    }
}