/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode start = dummy, end = dummy.next;
        ListNode temp;
        while (end != null){
            for (int i=0; i<k; i++){
                if (end == null) return dummy.next;
                end = end.next;
            }
            start = reverse(start,end);
            end = start.next;
        }
        return dummy.next;
    }
    public ListNode reverse (ListNode start, ListNode end){
        ListNode next;
        ListNode cur = start.next;
        ListNode first = start.next;
        ListNode prev = start; 
        while (cur != end){
            next = cur.next;
            cur.next=prev;
            prev = cur;
            cur = next;
        }
        start.next = prev;
        first.next = cur;
        return first;
        
    }
}