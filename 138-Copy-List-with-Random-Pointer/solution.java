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
        if (head == null) return head;
        RandomListNode carry = head;
        RandomListNode res = new RandomListNode(head.label);
        RandomListNode cur = res;
        HashMap<RandomListNode,RandomListNode> map = new HashMap<RandomListNode,RandomListNode>();
        map.put(head,cur);
        while (head.next != null){
            cur.next = new RandomListNode(head.next.label);
            map.put(head.next,cur.next);
            head=head.next;
            cur=cur.next;
        }
        cur = res;
        while (cur!= null){
            if (carry.random != null) cur.random = map.get(carry.random);
            carry=carry.next;
            cur=cur.next;
        }
        return res;
    }
}