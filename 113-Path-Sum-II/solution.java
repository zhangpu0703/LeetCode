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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        helper(res,root,sum,new ArrayList<Integer>());
        return res;
    }
    public void helper(List<List<Integer>> res, TreeNode root, int sum, List<Integer> path){
        if (root == null) return;
        path.add(root.val);
        if (root.val == sum && root.left == null && root.right == null){
            //path.add(root.val);
            res.add(new ArrayList<Integer>(path));
            return;
        }
        else{
            helper(res, root.left, sum-root.val,new ArrayList<>(path));
            helper(res, root.right, sum-root.val,new ArrayList<>(path));
        }
    }
}