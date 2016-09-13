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
        if (root == null) return true;
        long max = Long.MAX_VALUE, min = Long.MIN_VALUE;
        return valid(root,max,min);
    }
    
    public boolean valid(TreeNode root, Long max, Long min){
        if (root == null) return true;
        if (root.val<=min || root.val>=max) return false;
        return valid(root.left,(long)root.val,min) && valid(root.right, max,(long)root.val);
    }
}