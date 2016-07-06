public class LRUCache {
    private HashMap<Integer,Integer> map;
    private List<Integer> list;
    private int kk;
    public LRUCache(int capacity) {
        map = new HashMap<Integer, Integer>();
        list = new LinkedList<Integer>();
        kk = capacity;
    }
    
    public int get(int key) {
        if (map.containsKey(key)) {
            list.remove(list.indexOf(key));
            list.add(key);
            return map.get(key);
        }
        else return -1;
    }
    
    public void set(int key, int value) {
        if (map.containsKey(key)){
            list.remove(list.indexOf(key));
        }
        list.add(key);
        map.put(key,value); 
        if (list.size()>kk){
            map.remove(list.get(0));
            list.remove(0);
        }
        
    }
}