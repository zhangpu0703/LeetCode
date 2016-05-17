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
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        int val1 = 0;
        int val2 = 0;
        int flag = 0;
        while (l1 != null || l2 != null){
            if (l1 == null) val1 = 0;
            else val1=l1.val;
            if (l2 == null) val2 = 0;
            else val2=l2.val;
            int val = val1+val2+flag;
            if (val>=10) flag = 1;
            else flag = 0;
            cur.next = new ListNode(val%10);
            if (l1 != null) l1=l1.next;
            if (l2 != null) l2=l2.next;
            cur = cur.next;
        }
        if (flag == 1) cur.next = new ListNode(1);
        return dummy.next;
    }
}