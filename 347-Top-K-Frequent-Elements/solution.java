class Pair{
    int val, freq;
    public Pair(int val, int freq){
        this.val = val;
        this.freq = freq;
    }
}
public class Solution {
    private Comparator<Pair> PairComp = new Comparator<Pair>(){
        public int compare(Pair a, Pair b){
            return a.freq-b.freq;
        }
    };
    public List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int num : nums){
            if (map.containsKey(num)) map.put(num,map.get(num)+1);
            else map.put(num,1);
        }
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>(k,PairComp);
        for (int num : map.keySet()){
            Pair cur = new Pair(num,map.get(num));
            if (pq.size()<k) pq.offer(cur);
            else{
                Pair temp = pq.peek();
                if (cur.freq>temp.freq){
                    pq.poll();
                    pq.offer(cur);
                }
            }
        }
        List<Integer> res = new ArrayList<Integer>();
        while (!pq.isEmpty()){
            Pair cur = pq.poll();
            res.add(cur.val);
        }
        return res;
    }
}