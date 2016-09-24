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
        HashMap<RandomListNode, RandomListNode> map = new HashMap<RandomListNode, RandomListNode>();
        RandomListNode node = head;
        while (node != null){
            RandomListNode copy = new RandomListNode(node.label);
            map.put(node,copy);
            node = node.next;
        }
        RandomListNode newhead = map.get(head), cur = newhead;
        while (head != null){
            cur.next = map.get(head.next);
            cur.random = map.get(head.random);
            cur = cur.next;
            head = head.next;
        }
        return newhead;
    }
}