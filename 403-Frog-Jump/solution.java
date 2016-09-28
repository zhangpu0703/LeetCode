public class Solution {
    public boolean canCross(int[] stones) {
        HashMap<Integer,HashSet<Integer>> map = new HashMap<Integer,HashSet<Integer>>();
        for (int i=0; i<stones.length; i++){
            map.put(stones[i],new HashSet<Integer>());
        }
        for (int i=0; i<stones.length; i++){
            int s = stones[i];
            HashSet<Integer> curset = map.get(s);
            if (s == 0) curset.add(0);
            for (int k : curset){
                k--;
                int next = s+k;
                if (next != s && map.containsKey(next)) map.get(next).add(k);
                next++;
                k++;
                if (next != s && map.containsKey(next)) map.get(next).add(k);
                next++;
                k++;
                if (next != s && map.containsKey(next)) map.get(next).add(k);
            }
        }
        return !map.get(stones[stones.length-1]).isEmpty();
    }
}