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
    public int sumNumbers(TreeNode root) {
        return sum(root,0);
    }
    public int sum(TreeNode root, int cur){
        if (root == null) return 0;
        if (root.left == null && root.right == null) return cur*10+root.val;
        else return sum(root.left, cur*10+root.val)+sum(root.right, cur*10+root.val); 
    }
}