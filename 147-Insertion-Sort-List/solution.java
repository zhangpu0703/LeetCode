/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode insertionSortList(ListNode head) {
        ListNode res=new ListNode(0);
        ListNode cur = head;
        if (head == null || head.next == null) return head;
        while (cur != null){
            ListNode temp = cur.next;
            ListNode begin = res;
            while (begin.next != null && begin.next.val<cur.val) begin = begin.next;
            cur.next = begin.next;
            begin.next = cur;
            cur = temp;
        }
        return res.next;
    }
}