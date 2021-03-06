/**
 * Definition for undirected graph.
 * class UndirectedGraphNode {
 *     int label;
 *     List<UndirectedGraphNode> neighbors;
 *     UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
 * };
 */
public class Solution {
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        HashMap<UndirectedGraphNode, UndirectedGraphNode> map = new HashMap<UndirectedGraphNode, UndirectedGraphNode>();
        Queue<UndirectedGraphNode> queue = new LinkedList<UndirectedGraphNode>();
        HashSet<UndirectedGraphNode> set = new HashSet<UndirectedGraphNode>();
        if (node == null) return null;
        queue.offer(node);
        while(!queue.isEmpty()){
            int size = queue.size();
            for (int i=0; i<size; i++){
                UndirectedGraphNode cur = queue.poll();
                if (set.contains(cur)) continue;
                set.add(cur);
                List<UndirectedGraphNode> neibs = cur.neighbors;
                for (UndirectedGraphNode n : neibs) queue.offer(n);
                UndirectedGraphNode newNode = new  UndirectedGraphNode(cur.label);
                map.put(cur,newNode);
            }
             
        }
        
        set = new HashSet<UndirectedGraphNode>();
        queue.offer(node);
        while(!queue.isEmpty()){
            int size = queue.size();
            for (int i=0; i<size; i++){
                UndirectedGraphNode old = queue.poll();
                if (set.contains(old)) continue;
                set.add(old);
                List<UndirectedGraphNode> neibs = old.neighbors;
                List<UndirectedGraphNode> newList = new ArrayList<UndirectedGraphNode>();
                for (UndirectedGraphNode n : neibs){
                    queue.offer(n);
                    newList.add(map.get(n));
                }
                UndirectedGraphNode copy = map.get(old);
                copy.neighbors = new ArrayList(newList);
            }
        }
        return map.get(node);
        
    }
}