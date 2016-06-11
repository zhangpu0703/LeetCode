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
    public int kthSmallest(TreeNode root, int k) {
        int num = countNodes(root.left);
        if (num == k-1) return root.val;
        else if (k-1<num) return kthSmallest(root.left, k);
        else return kthSmallest(root.right, k-num-1);
    }
    public int countNodes(TreeNode root){
        if (root == null) return 0;
        return 1+countNodes(root.left)+countNodes(root.right);
    }
}