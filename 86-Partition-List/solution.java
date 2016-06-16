/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode lt = new ListNode(0);
        ListNode gte = new ListNode(0);
        ListNode curL = lt;
        ListNode curG = gte;
        while(head != null){
            if (head.val<x){
                curL.next=head;
                curL=curL.next;
            }
            else{
                curG.next = head;
                curG=curG.next;
            }
            head=head.next;
        }
        curG.next = null;
        curL.next = gte.next;
        return lt.next;
    }
    
}