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
        ListNode odd = head, even = head.next;
        ListNode curodd = odd, cureven = even;
        while (cureven != null && cureven.next != null){
            curodd.next = cureven.next;
            cureven.next = curodd.next.next;
            curodd = curodd.next;
            cureven = cureven.next;
        }
        curodd.next = even;
        return odd;
    }
}