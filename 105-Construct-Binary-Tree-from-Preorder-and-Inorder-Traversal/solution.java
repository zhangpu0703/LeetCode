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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0) return null;
        int rootVal = preorder[0];
        TreeNode root = new TreeNode(rootVal);
        int i=0;
        while (inorder[i]!=rootVal) i++;
        int[] leftIn = Arrays.copyOfRange(inorder,0,i);
        int[] rightIn = Arrays.copyOfRange(inorder,i+1,inorder.length);
        int[] leftPre = Arrays.copyOfRange(preorder,1,i+1);
        int[] rightPre = Arrays.copyOfRange(preorder,i+1,preorder.length);
        root.left = buildTree(leftPre,leftIn);
        root.right = buildTree(rightPre,rightIn);
        return root;
    }
}