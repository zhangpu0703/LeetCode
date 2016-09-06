/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0), cur = dummy;
        int carry = 0;
        while(l1 != null || l2 != null){
            int val1 = 0, val2=0;
            if (l1 != null){
                val1 = l1.val;
                l1 = l1.next;
            }
            if (l2 != null){
                val2 = l2.val;
                l2 = l2.next;
            }
            int sum = val1+val2+carry;
            carry = sum/10;
            sum%=10;
            cur.next = new ListNode(sum);
            cur=cur.next;
        }
        if (carry == 1) cur.next = new ListNode(1);
        return dummy.next;
    }
}