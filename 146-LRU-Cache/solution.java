public class LRUCache {
    private HashMap<Integer,Integer> lruCache;
    private List<Integer> keys;
    private int cap;
    public LRUCache(int capacity) {
        lruCache = new HashMap<Integer, Integer>();
        keys = new LinkedList<Integer>();
        cap=capacity;
    }
    
    public int get(int key) {
        if (lruCache.containsKey(key)) {
            keys.remove(keys.indexOf(key));
            keys.add(key);
            return lruCache.get(key);
        }
        else return -1;
    }
    
    public void set(int key, int value) {
        if (lruCache.containsKey(key)){
            keys.remove(keys.indexOf(key));
        }
        keys.add(key);
        lruCache.put(key,value); 
        if (keys.size()>cap){
            lruCache.remove(keys.get(0));
            keys.remove(0);
        }
        
    }
}