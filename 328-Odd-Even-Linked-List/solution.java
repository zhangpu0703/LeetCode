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
        while(cureven != null && cureven.next != null){
            ListNode temp = cureven.next.next;
            curodd.next = cureven.next;
            curodd = curodd.next;
            cureven.next = temp;
            cureven = cureven.next;
            
        }
        if (cureven != null) cureven.next = null;
        curodd.next = even;
        return odd; 
    }
}