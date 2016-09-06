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
        public int compare(ListNode a, ListNode b){
            return a.val-b.val;
        }
    };
    public ListNode mergeKLists(ListNode[] lists) {
        int k = lists.length;
        if (k==0) return null;
        PriorityQueue<ListNode> pq = new PriorityQueue<ListNode>(k,nodeComp);
        for (ListNode node : lists) {
            if (node != null) pq.offer(node);
        }
        ListNode res = new ListNode(0), cur = res;
        while (!pq.isEmpty()){
            ListNode node = pq.poll();
            cur.next = new ListNode(node.val);
            if (node.next != null) pq.offer(node.next);
            cur = cur.next;
        }
        return res.next;
    }
}