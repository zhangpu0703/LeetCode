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
    private int res = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        if (root == null) return 0;
        maxpath(root);
        return res;
    }
    public int maxpath(TreeNode root){
        if (root == null) return 0;
        int left = Math.max(maxpath(root.left),0);
        int right = Math.max(maxpath(root.right),0);
        res = Math.max(res,root.val+left+right);
        return root.val+Math.max(left,right);
    }
}