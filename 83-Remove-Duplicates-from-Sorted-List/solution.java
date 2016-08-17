/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0), cur = dummy;
        while (head != null){
            cur.next = head;
            while (head.next != null && head.next.val == head.val) head = head.next;
            head = head.next;
            cur = cur.next;
        }
        cur.next = null;
        return dummy.next;
    }
}