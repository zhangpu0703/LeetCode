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
        int lenA = 0, lenB = 0;
        ListNode nodeA = headA, nodeB = headB;
        while (nodeA != null){
            nodeA = nodeA.next;
            lenA++;
        }
        while (nodeB != null){
            nodeB = nodeB.next;
            lenB++;
        }
        if (lenA>lenB){
            for (int i=0; i<lenA-lenB; i++) headA = headA.next;
        }
        else{
            for (int i=0; i<lenB-lenA; i++) headB = headB.next;
        }
        while (headA != null){
            if (headA == headB) return headA;
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }
}