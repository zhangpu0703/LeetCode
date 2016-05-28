/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        if (root == null) return "";
        queue.offer(root);
        sb.append(root.val);
        while (!queue.isEmpty()){
            TreeNode cur = queue.poll();
            if (cur.left == null) sb.append(",#");
            else {
                sb.append(",");
                sb.append(cur.left.val);
                queue.offer(cur.left);
            }
            if (cur.right == null) sb.append(",#");
            else {
                sb.append(",");
                sb.append(cur.right.val);
                queue.offer(cur.right);
            }
        }
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data.length()==0) return null;
        String[] tree = data.split(",");
        TreeNode root = new TreeNode(Integer.parseInt(tree[0]));
        //int end = data.length();
        //while (end>0 && data.charAt(end-1)=='#') end--;
        //String tree = data.substring(0,end);
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        int ind =1;
        while (!queue.isEmpty()){
            TreeNode cur= queue.poll();
            if (!tree[ind].equals("#")){
                TreeNode left = new TreeNode(Integer.parseInt(tree[ind]));
                cur.left= left;
                queue.offer(left);
                
            }
            ind++;
            if (!tree[ind].equals("#")){
                TreeNode right = new TreeNode(Integer.parseInt(tree[ind]));
                cur.right= right;
                queue.offer(right);
            }
            ind++;
        }
        return root;
        
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));