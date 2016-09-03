public class RandomizedCollection {
    private HashMap<Integer, Set<Integer>> map;
    private List<Integer> list;
    private Random rand;
    /** Initialize your data structure here. */
    public RandomizedCollection() {
        map = new HashMap<Integer,Set<Integer>>();
        list = new ArrayList<Integer>();
        rand = new Random();
    }
    
    /** Inserts a value to the collection. Returns true if the collection did not already contain the specified element. */
    public boolean insert(int val) {
        if (map.containsKey(val)){
            Set<Integer> indexes = map.get(val);
            indexes.add(list.size());
            map.put(val,indexes);
            list.add(val);
            return false;
        }
        else{
            Set<Integer> indexes = new LinkedHashSet<Integer>();
            indexes.add(list.size());
            map.put(val,indexes);
            list.add(val);
            return true;
        }
    }
    
    /** Removes a value from the collection. Returns true if the collection contained the specified element. */
    public boolean remove(int val) {
        if (!map.containsKey(val)) return false;
        Set<Integer> cur = map.get(val);
        int ind = cur.iterator().next();
        map.get(val).remove(ind);
        if (ind<list.size()-1){
            int last = list.get(list.size()-1);
            list.set(ind,last);
            Set<Integer> lastInd = map.get(last);
            lastInd.remove(list.size()-1);
            lastInd.add(ind);
            map.put(last,lastInd);
        }
        if (map.get(val).size()==0) map.remove(val);
        list.remove(list.size()-1);
        return true;
    }
    
    /** Get a random element from the collection. */
    public int getRandom() {
        return list.get(rand.nextInt(list.size()));
    }
}

/**
 * Your RandomizedCollection object will be instantiated and called as such:
 * RandomizedCollection obj = new RandomizedCollection();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */