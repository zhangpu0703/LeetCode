class Pair{
    int val, freq;
    public Pair(int val, int freq){
        this.val = val;
        this.freq = freq;
    }
}
public class Solution {
    private Comparator<Pair> pairComp = new Comparator<Pair>(){
        public int compare (Pair a, Pair b){
            return a.freq-b.freq;
        }
    };
    public List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int num : nums){
            if (map.containsKey(num)) map.put(num,map.get(num)+1);
            else map.put(num,1);
        }
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>(k,pairComp);
        for (int num : map.keySet()){
            if (pq.size()<k) pq.offer(new Pair(num,map.get(num)));
            else{
                Pair cur = pq.peek();
                if (map.get(num)>cur.freq){
                    pq.poll();
                    pq.offer(new Pair(num,map.get(num)));
                }
            }
        }
        List<Integer> res = new ArrayList<Integer>();
        while (!pq.isEmpty()) res.add(pq.poll().val);
        return res;
    }
}