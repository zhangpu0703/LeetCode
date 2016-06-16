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
    public int countNodes(TreeNode root) {
        if (root == null) return 0;
        int leftH = height(root.left);
        int rightH= height(root.right);
        if (leftH == rightH) return (1<<leftH)+countNodes(root.right);
        else return (1<<rightH)+countNodes(root.left);
    }
    
    public int height(TreeNode root){
        if (root == null) return 0;
        else return 1+height(root.left);
    }
}