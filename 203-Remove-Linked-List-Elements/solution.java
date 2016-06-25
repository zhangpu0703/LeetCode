/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        while (head != null){
            if (head.val != val) {
                cur.next = new ListNode(head.val);
                cur=cur.next;
            }
            head=head.next;
        }
        return dummy.next;
    }
}