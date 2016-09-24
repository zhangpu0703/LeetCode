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
    private List<List<Integer>> res = new ArrayList<List<Integer>>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        helper(root,sum,new ArrayList<Integer>());
        return res;
    }
    public void helper(TreeNode root, int sum, List<Integer> path){
        if (root == null) return;
        if (root.left == null && root.right == null){
            if (root.val == sum){
                path.add(root.val);
                res.add(new ArrayList<Integer>(path));
            }
            return;
        }
        path.add(root.val);
        helper(root.left,sum-root.val,new ArrayList<Integer>(path));
        helper(root.right,sum-root.val,new ArrayList<Integer>(path));
    }
}