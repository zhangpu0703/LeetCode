/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    private Comparator<ListNode> nodeComp = new Comparator<ListNode>(){
        public int compare (ListNode a, ListNode b){
            return a.val-b.val;
        }
    };
    public ListNode mergeKLists(ListNode[] lists) {
        int k = lists.length;
        if (k == 0) return null;
        PriorityQueue<ListNode> pq = new PriorityQueue<ListNode>(k,nodeComp);
        for (ListNode head : lists) {
            if (head != null) pq.offer(head);
        }
        ListNode dummy = new ListNode(0), cur = dummy;
        while (!pq.isEmpty()){
            ListNode temp = pq.poll();
            cur.next = temp;
            cur = cur.next;
            if (temp.next != null) pq.offer(temp.next);
        }
        return dummy.next;
    }
}