/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode (0);
        dummy.next=head;
        ListNode cur = dummy;
        while (cur.next != null && cur.next.next != null){
            ListNode n1 = cur.next;
            ListNode n2 = cur.next.next;
            n1.next=n2.next;
            n2.next=n1;
            cur.next=n2;
            cur=n2.next;
        }
        return dummy.next;
    }
}