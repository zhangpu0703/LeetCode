/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head==null || head.next == null ) return head;
        int n = 0;
        ListNode cur = head;
        while(cur != null){
            cur=cur.next;
            n++;
        }
        k=k%n;
        if (k==0) return head;
        ListNode second = head;
        ListNode prev = null;
        for (int i=0; i<n-k; i++){
            prev = second;
            second=second.next;
        }
        prev.next = null;
        cur = second;
        while (cur.next != null) cur = cur.next;
        cur.next = head;
        return second;
    }
}