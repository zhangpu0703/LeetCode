/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head, slow = head;
        while (fast!=null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        if (fast!=null) slow = slow.next;
        slow = reverse(slow);
        while (slow != null){
            if (head.val != slow.val) return false;
            head=head.next;
            slow = slow.next;
        }
        return true;
    }
    public ListNode reverse(ListNode head){
        ListNode prev = null, cur = head;
        while (cur != null){
            ListNode temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        return prev;
    }
}