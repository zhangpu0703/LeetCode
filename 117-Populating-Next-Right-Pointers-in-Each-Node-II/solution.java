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
        TreeLinkNode head = null, last = null;
        while (root != null){
            while (root!=null){
                if (root.left != null){
                    if (last == null) head = root.left;
                    else last.next = root.left;
                    last = root.left;
                }
                if (root.right != null){
                    if (last == null) head = root.right;
                    else last.next = root.right;
                    last = root.right;
                }
                root = root.next;
            }
            root = head;
            head = null;
            last = null;
        }
    }
}