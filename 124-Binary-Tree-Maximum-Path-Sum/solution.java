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
    public int maxPathSum(TreeNode root) {
        int res = root.val;
        if (root.left == null && root.right == null) return res;
        
        else if (root.right == null) {
            res += Math.max(0,maxpath(root.left));
            return Math.max(res,maxPathSum(root.left));
        }
        else if (root.left == null){
            res += Math.max(0,maxpath(root.right));
            return Math.max(res,maxPathSum(root.right));
        } 
        else{
            res += Math.max(0,maxpath(root.left));
            res += Math.max(0,maxpath(root.right));
            return Math.max(res,Math.max(maxPathSum(root.left), maxPathSum(root.right)));
        }
    }
    public int maxpath(TreeNode root){
        if (root == null) return 0;
        if (root.left == null && root.right == null) return root.val;
        else return root.val+Math.max(Math.max(0,maxpath(root.left)),Math.max(0,maxpath(root.right)));
    }
}