/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode dummy = new ListNode(0);
        if (lists.length == 0) return dummy.next;
        ListNode temp = dummy;
        Comparator<ListNode> nodeComp = new Comparator<ListNode>(){
            @Override
            public int compare(ListNode l1, ListNode l2){
                return l1.val-l2.val;
            }
        };
        PriorityQueue<ListNode> queue = new PriorityQueue<ListNode>(lists.length,nodeComp);
        for (int i = 0; i<lists.length; i++){
            if (lists[i]!=null) queue.offer(lists[i]);
        }
        while (!queue.isEmpty()){
            ListNode cur = queue.poll();
            temp.next = cur;
            if (cur.next != null) queue.offer(cur.next);
            temp = temp.next;
            
        }
        return dummy.next;
    }
}