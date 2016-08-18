/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        if (head == null) return null;
        RandomListNode dummy = new RandomListNode(0), cur = dummy;
        RandomListNode node = head;
        HashMap<RandomListNode, RandomListNode> map = new HashMap<RandomListNode, RandomListNode>();
        while (node!=null){
            cur.next = new RandomListNode(node.label);
            cur = cur.next;
            map.put(node,cur);
            node = node.next;
        }
        while (head!=null){
            cur = map.get(head);
            if (head.random != null) cur.random = map.get(head.random);
            head = head.next;
        }
        return dummy.next;
    }
}