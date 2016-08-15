/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    Random randGen;
    ListNode head;
    /** @param head The linked list's head.
        Note that the head is guaranteed to be not null, so it contains at least one node. */
    public Solution(ListNode head) {
        this.randGen = new Random();
        this.head = head;
    }
    
    /** Returns a random node's value. */
    public int getRandom() {
        int n = 1;
        ListNode cur = head;
        int res = 0;
        while (cur != null){
            int rand = randGen.nextInt(n);
            if (rand == 0) res = cur.val;
            cur = cur.next;
            n++;
        }
        return res;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */