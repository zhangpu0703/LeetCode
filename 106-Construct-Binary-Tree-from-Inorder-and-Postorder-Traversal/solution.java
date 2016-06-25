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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (postorder.length == 0) return null;
        int rootVal = postorder[postorder.length-1];
        TreeNode root = new TreeNode(rootVal);
        int ind = 0;
        while(inorder[ind]!=rootVal) ind++;
        int[] leftIn = Arrays.copyOfRange(inorder,0,ind);
        int[] rightIn = Arrays.copyOfRange(inorder, ind+1, inorder.length);
        int[] leftPost = Arrays.copyOfRange(postorder, 0, ind);
        int[] rightPost = Arrays.copyOfRange(postorder, ind, postorder.length-1);
        root.left = buildTree(leftIn,leftPost);
        root.right = buildTree(rightIn,rightPost);
        return root;
    }
}