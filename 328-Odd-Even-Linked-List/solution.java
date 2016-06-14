/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode odd = head;
        ListNode even = head.next;
        ListNode curEven = even;
        while (curEven != null && curEven.next!=null){
            odd.next = curEven.next;
            curEven.next = odd.next.next;
            odd = odd.next;
            curEven=odd.next;
        }
        
        odd.next = even;
        return head;
    }
}