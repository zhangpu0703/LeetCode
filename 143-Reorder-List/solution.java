/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }
        prev.next = null;
        ListNode cur = slow;
        ListNode pp = null;
        while (cur != null){
            ListNode temp = cur.next;
            cur.next = pp;
            pp = cur;
            cur = temp;
        }
        ListNode dummy = new ListNode(0);
        cur = dummy;
        while (head != null && pp != null){
            cur.next = head;
            head = head.next;
            cur = cur.next;
            cur.next = pp;
            pp=pp.next;
            cur = cur.next;
        }
        if (head != null) head.next = prev;
        if (pp != null) cur.next = pp;
        head = dummy.next;
        return;
        
    }
}