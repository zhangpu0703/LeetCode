/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) return head; 
        ListNode dummy = new ListNode(0);
        dummy.next=head;
        int n = 0;
        ListNode fast = dummy;
        while (fast.next != null){
            fast=fast.next;
            n++;
        }
        ListNode slow = dummy;
        for (int i = 0; i<n-k%n; i++){
            slow=slow.next;
        }
        fast.next = head;
        dummy.next=slow.next;
        slow.next=null;
        return dummy.next;
        
    }
}