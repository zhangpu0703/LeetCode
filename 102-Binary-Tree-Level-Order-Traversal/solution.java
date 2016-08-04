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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (root == null) return res;
        queue.offer(root);
        while (!queue.isEmpty()){
            List<Integer> path = new ArrayList<Integer>();
            int size = queue.size();
            for (int i=0; i<size; i++){
                TreeNode node = queue.poll();
                path.add(node.val);
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
            res.add(new ArrayList(path));
        }
        return res;
    }
}