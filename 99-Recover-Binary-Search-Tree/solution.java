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
    public void recoverTree(TreeNode root) {
        List<Integer> treeList = new ArrayList<Integer>();
        inorder(root, treeList);
        int gt = 0;
        int lt = 0;
        for (int i=0; i<treeList.size(); i++){
            if (i<treeList.size()-1 && treeList.get(i)>treeList.get(i+1)) {
                gt = treeList.get(i);
                break;
            }
            if (i>0 && treeList.get(i)<treeList.get(i-1)) lt = treeList.get(i);
        }
        for (int i=treeList.size()-1; i>=0; i--){
            if (i>0 && treeList.get(i)<treeList.get(i-1)) {
                lt = treeList.get(i);
                break;
            }
            
        }
        update(root,gt,lt);
        
    }
    public void inorder(TreeNode root, List<Integer>treeList){
        if (root == null) return;
        inorder(root.left,treeList);
        treeList.add(root.val);
        inorder(root.right,treeList);
    }
    
    public void update(TreeNode root, int gt, int lt){
        if (root == null) return;
        if (root.val == gt){
            root.val = lt;
        }
        else if (root.val==lt) root.val=gt;
        update(root.left,gt,lt);
        update(root.right,gt,lt);
    }
}