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
            if (head.next == null || head.next.val != head.val) {
                cur.next = head;
                cur = cur.next;
                head = head.next;
            }
            else{
                while (head.next != null && head.next.val == head.val) head = head.next;
                head = head.next;
            }
        }
        cur.next = null;
        return dummy.next;
    }
}