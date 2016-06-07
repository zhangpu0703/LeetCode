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
    public List<String> binaryTreePaths(TreeNode root) {
        List <String> res = new ArrayList<String>();
        if (root != null) helper(res,"",root);
        return res;
    }
    public void helper(List<String> res, String path, TreeNode root){
        if (root.left == null && root.right == null) res.add(path+root.val);
        if (root.left != null) helper(res, path+root.val+"->", root.left);
        if (root.right != null) helper(res, path+root.val+"->", root.right);
    }
}