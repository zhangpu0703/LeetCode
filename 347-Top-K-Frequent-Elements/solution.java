class pair{
    int value;
    int freq;
    public pair (int value, int freq){
        this.value=value;
        this.freq = freq;
    }
}
public class Solution {
    private Comparator<pair> pairComp = new Comparator<pair>(){
        @Override
        public int compare(pair p1, pair p2){
            return p2.freq-p1.freq;
        }
    };
    
    public List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int num:nums){
            if (map.containsKey(num)) map.put(num,map.get(num)+1);
            else map.put(num,1);
        }
        PriorityQueue<pair> queue = new PriorityQueue<pair>(pairComp);
        for (int num : map.keySet()){
            pair cur = new pair(num,map.get(num));
            queue.offer(cur);
        }
        List<Integer> res = new ArrayList<Integer>();
        for (int i=0; i<k; i++){
            res.add(queue.poll().value);
        }
        return res;
    }
}