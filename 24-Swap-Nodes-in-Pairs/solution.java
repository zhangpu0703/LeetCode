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
        if (head == null || head.next == null) return head;
        ListNode odd = new ListNode(0);
        ListNode even = new ListNode(0);
        ListNode curOdd = odd;
        ListNode curEven = even;
        while (head!=null && head.next != null){
            curOdd.next = head;
            curEven.next = head.next;
            head=head.next.next;
            curOdd=curOdd.next;
            curEven=curEven.next;
        }
        if (head != null) {
            curOdd.next = head;
        }
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        curOdd = odd;
        curEven = even;
        while(curOdd!=null && curEven != null){
            cur.next = curEven.next;
            cur.next.next = curOdd.next;
            cur=cur.next.next;
            curOdd=curOdd.next;
            curEven=curEven.next;
        }
        return dummy.next;
    }
}