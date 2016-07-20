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
        if (head==null || head.next == null) return head;
        ListNode slow = head;
        ListNode fast = head;
        ListNode first = null;
        while (fast!=null && fast.next!=null){
            fast = fast.next.next;
            first = slow;
            slow=slow.next;
        }
        first.next = null;
        ListNode l1 = sortList(head);
        ListNode l2 = sortList(slow);
        return merge(l1,l2);
    }
    public ListNode merge(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        while (l1 != null || l2 != null){
            if (l1 == null){
                cur.next=new ListNode(l2.val);
                l2 = l2.next;
            }
            else if (l2 == null){
                cur.next=new ListNode(l1.val);
                l1 = l1.next;
            }
            else{
                if (l1.val<l2.val){
                    cur.next=new ListNode(l1.val);
                    l1 = l1.next;
                }
                else{
                    cur.next=new ListNode(l2.val);
                    l2 = l2.next;
                }
            }
            cur = cur.next;
        }
        return dummy.next;
    }
}