/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode start = dummy;
        ListNode end = dummy.next;
        ListNode temp;
        
        while (end != null){
            for (int i=0; i<k-1; i++){
                if (end.next != null) end=end.next;
                else return dummy.next;
            }
            temp = end.next;
            start=reverse(start,end);
            end = temp;
        }
        return dummy.next;
    }
    
    public ListNode reverse(ListNode start, ListNode end){
        ListNode res = start.next;
        while(start.next != end){
            ListNode temp = start.next;
            start.next = temp.next;
            temp.next = end.next;
            end.next=temp; 
        }
        return res;
    }
}