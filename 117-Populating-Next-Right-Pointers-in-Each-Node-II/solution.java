/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        if (root == null) return;
        TreeLinkNode prev = null;
        TreeLinkNode head = null;
        TreeLinkNode cur = root;
        while (cur!=null){
            while(cur!=null){
                if (cur.left !=null){
                    if (prev == null){
                        head = cur.left;
                    }
                    else {
                        prev.next = cur.left;
                    }
                    prev = cur.left;
                }
                if (cur.right != null){
                    if (prev == null) head=cur.right;
                    else{
                        prev.next = cur.right;
                    }
                    prev = cur.right;
                }
                cur = cur.next;
            }
            cur = head;
            prev = null;
            head = null;
        }
        
    }
}