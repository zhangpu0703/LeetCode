public class Solution {
    class node{
        int num, freq;
        public node(int num, int freq){
            this.num=num;
            this.freq = freq;
        }
    }
    private Comparator<node> nodeComp = new Comparator<node>(){
        public int compare(node a, node b){
            return a.freq-b.freq;
        }
    };
    public List<Integer> topKFrequent(int[] nums, int k) {
        PriorityQueue<node> queue = new PriorityQueue<node>(k,nodeComp);
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i<nums.length; i++){
            if (map.containsKey(nums[i])) map.put(nums[i],map.get(nums[i])+1);
            else map.put(nums[i],1);
        }
        for (int key : map.keySet()){
            node cur = new node(key,map.get(key));
            if (queue.size()<k) queue.offer(cur);
            else{
                node temp = queue.peek();
                if (temp.freq<=cur.freq){
                    queue.poll();
                    queue.offer(cur);
                }
            }
        }
        List<Integer> res = new ArrayList<Integer>();
        while (!queue.isEmpty()){
            res.add(queue.poll().num);
        }
        return res;
    }
}