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
        if (head == null || head.next == null){
            return head;
        }
        ListNode odd=head;
        ListNode even=head.next;
        ListNode cureven = even;
        while (cureven != null && cureven.next != null){
            odd.next = cureven.next;
            cureven.next=odd.next.next;
            odd=odd.next;
            cureven=cureven.next;
        }
        odd.next=even;
        return head;
    }
}