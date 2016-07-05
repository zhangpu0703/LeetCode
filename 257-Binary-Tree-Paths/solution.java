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
    private List<String> res = new ArrayList<String>();
    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null) return res;
        helper(root,"");
        return res;
    }
    public void helper(TreeNode root, String path){
        //if (root == null) res.add(new ArrayList(path));
        if (root.left == null && root.right == null){
            path=path+root.val;
            res.add(new String(path));
            return;
        }
        if (root.left != null) {
            String cur =path+root.val+"->";
            helper(root.left,cur);
        }
        if (root.right != null) {
            String cur =path+root.val+"->";
            helper(root.right,cur);
        }
    }
}