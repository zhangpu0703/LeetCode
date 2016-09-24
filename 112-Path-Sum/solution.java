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
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;
        //else if (root == null) return true;
        if (root.left == null && root.right == null){
            if (root.val == sum) return true;
            else return false;
        }
        if (root.left == null){
            return hasPathSum(root.right,sum-root.val);
        }
        if (root.right == null){
            return hasPathSum(root.left,sum-root.val);
        }
        return hasPathSum(root.left,sum-root.val) || hasPathSum(root.right,sum-root.val);
    }
}