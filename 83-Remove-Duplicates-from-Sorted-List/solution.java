/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        while (head!=null){
            while (head.next!=null && head.next.val==head.val) head=head.next;
            cur.next=new ListNode(head.val);
            cur=cur.next;
            head = head.next;
        }
        return dummy.next;
    }
}