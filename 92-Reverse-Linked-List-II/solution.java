/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        
        for (int i=0; i<m-1; i++){
            prev=prev.next;
        }
        ListNode start=prev.next;
        ListNode cur = start.next;
        for (int j=0; j<n-m; j++){
            ListNode temp = cur.next;
            cur.next=start;
            start = cur;
            cur = temp;
        }
        prev.next.next = cur;
        prev.next = start;
        return dummy.next;
    }
}