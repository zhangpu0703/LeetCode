class pair{
    int key;
    int count;
    pair(int key, int count){
        this.key=key;
        this.count=count;
    }
}
public class Solution {
    private Comparator<pair> pairComp = new Comparator<pair>(){
        public int compare(pair A,pair B){
            return A.count-B.count;
        }
    };
    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> res = new ArrayList<Integer>();
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int num : nums){
            if (map.containsKey(num)) map.put(num,map.get(num)+1);
            else map.put(num,1);
        }
        PriorityQueue<pair> heap = new PriorityQueue<pair>(k, pairComp);
        for (int num : map.keySet()){
            pair curMin= heap.peek();
            if (heap.size()<k) heap.add(new pair(num,map.get(num)));
            else if (curMin.count<map.get(num)){
                heap.poll();
                heap.add(new pair(num,map.get(num)));
            }
        }
        while(!heap.isEmpty()){
            pair cur= heap.poll();
            res.add(cur.key);
        }
        for (int i=0; i<k/2; i++){
            int temp=res.get(i);
            res.set(i,res.get(k-1-i));
            res.set(k-1-i,temp);
        }
        return res;
    }
}