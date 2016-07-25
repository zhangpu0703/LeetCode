/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode curA = headA, curB=headB;
        int lenA=0, lenB=0;
        while (curA!=null){
            curA=curA.next;
            lenA++;
        }
        while (curB!=null){
            curB=curB.next;
            lenB++;
        }
        for (int i=0; i<lenA-lenB; i++) headA=headA.next;
        for (int i=0; i<lenB-lenA; i++) headB=headB.next;
        while (headA!=null && headB != null){
            if (headA==headB) return headA; 
            headA=headA.next;
            headB=headB.next;
        }
        return null;
    }
}