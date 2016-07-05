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
        ListNode fast = head;
        ListNode slow = head;
        ListNode prev = null;
        while(fast != null && fast.next != null){
            prev = slow;
            fast = fast.next.next;
            slow = slow.next;
        }
        prev.next = null;
        
        return merge(sortList(head),sortList(slow));
    }
    
    public ListNode merge(ListNode l1, ListNode l2){
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        while (l1 != null || l2 != null){
            if (l1 == null){
                cur.next = l2;
                l2 = l2.next;
            }
            else if (l2 == null){
                cur.next = l1;
                l1 = l1.next;
            }
            else{
                if (l2.val>l1.val){
                    cur.next = l1;
                    l1 = l1.next;
                }
                else{
                    cur.next = l2;
                    l2 = l2.next;
                }
            }
            cur = cur.next;
        }
        return dummy.next;
    }
}