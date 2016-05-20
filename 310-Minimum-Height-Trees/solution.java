public class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<List<Integer>> edge = new ArrayList<List<Integer>>();
        if (edges.length == 0) return new ArrayList<Integer>();
        for (int i = 0; i<edges.length; i++){
            List<Integer> sub = new ArrayList<Integer> ();
            sub.add(edges[i][0]);
            sub.add(edges[i][1]);
            edge.add(sub);
        }
        return helper (n, edge);
        
    }
    public List<Integer> helper(int n, List<List<Integer>> edge){
        HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
        if (edge.size()==1) return edge.get(0);
        System.out.println(edge.size());
        for (int i = 0; i<edge.size(); i++){
            int a = edge.get(i).get(0);
            int b = edge.get(i).get(1);
            if (!map.containsKey(a)) map.put(a,1);
            else map.put(a,map.get(a)+1);
            if (!map.containsKey(b)) map.put(b,1);
            else map.put(b,map.get(b)+1);
        }
        HashSet<Integer> set = new HashSet<>();
        List<Integer> cur = new ArrayList<Integer>();
        for (int i = 0; i<n; i++){
            if (map.containsKey(i) && map.get(i)==1) set.add(i);
            if (map.containsKey(i) && map.get(i)!=1) cur.add(i);
        }
        if (cur.size()==1 || cur.size()==2) return cur;
        List<List<Integer>> next = new ArrayList<List<Integer>>();
        for (int i = 0; i<edge.size(); i++){
            if (!set.contains(edge.get(i).get(0)) && !set.contains(edge.get(i).get(1))){
                List<Integer> temp = new ArrayList<Integer>();
                temp.add(edge.get(i).get(0));
                temp.add(edge.get(i).get(1));
                next.add(temp);
            }
        }
        return helper(n, next);
        
    }
}