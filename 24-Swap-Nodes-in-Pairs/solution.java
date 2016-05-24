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
        ListNode temp = new ListNode (0);
        temp.next=head;
        ListNode swap = temp;
        while (swap.next != null && swap.next.next != null){
            ListNode n1 = swap.next;
            ListNode n2 = swap.next.next;
            n1.next=n2.next;
            swap.next=n2;
            swap.next.next=n1;
            swap=swap.next.next;
        }
        return temp.next;
    }
}