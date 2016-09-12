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
        int n = preorder.length;
        if (n==0) return null;
        int val = preorder[0];
        TreeNode root = new TreeNode(val);
        int len = 0;
        while(len<n){
            if (inorder[len]==val) break;
        }
        int[] leftPre = Arrays.copyOfRange(preorder,1,len+1);
        int[] rightPre = Arrays.copyOfRange(preorder,len+1,n);
        int[] leftIn = Arrays.copyOfRange(inorder,0,len);
        int[] rightIn = Arrays.copyOfRange(inorder,len+1,n);
        root.left = buildTree(leftPre,leftIn);
        root.right = buildTree(rightPre,rightIn);
        return root;
    }
}