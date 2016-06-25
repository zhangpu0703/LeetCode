/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) return null;
        ListNode dummy = new ListNode(0);
        dummy.next=head;
        ListNode fast = dummy;
        ListNode slow = dummy;
        while (fast.next != null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        TreeNode root = new TreeNode(slow.next.val);
        ListNode righthead = slow.next.next;
        slow.next = null;
        ListNode lefthead = dummy.next;
        root.left = sortedListToBST(lefthead);
        root.right = sortedListToBST(righthead);
        return root;
    }
}