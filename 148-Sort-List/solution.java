/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode slow = head, fast = head, prev = null;
        while (fast!=null && fast.next != null){
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }
        prev.next = null;
        ListNode left = sortList(head), right = sortList(slow);
        return merge(left,right);
    }
    public ListNode merge(ListNode a, ListNode b){
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        while (a!=null || b!=null){
            if (a==null){
                cur.next = new ListNode(b.val);
                b=b.next;
            }
            else if (b==null){
                cur.next = new ListNode(a.val);
                a=a.next;
            }
            else if (a.val<b.val){
                cur.next = new ListNode(a.val);
                a=a.next;
            }
            else{
                cur.next = new ListNode(b.val);
                b=b.next; 
            }
            cur = cur.next;
        }
        return dummy.next;
    }
}