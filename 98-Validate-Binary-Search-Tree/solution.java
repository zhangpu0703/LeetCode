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
        return valid(root,Long.MAX_VALUE, Long.MIN_VALUE);
    }
    public boolean valid (TreeNode root, long max, long min){
        if (root == null) return true;
        if (root.val>=max || root.val <= min) return false;
        else return valid(root.left,(long)root.val,min) && valid(root.right,max,(long)root.val);
    }
}