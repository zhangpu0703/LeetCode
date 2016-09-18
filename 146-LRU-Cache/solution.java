class DNode{
    DNode prev;
    DNode next;
    int value;
    int key;
}

public class LRUCache {
    private void remove(DNode cur){
        DNode prev = cur.prev, next = cur.next;
        prev.next = next;
        next.prev = prev;
    }
    private void add(DNode cur){
        cur.next = tail;
        cur.prev = tail.prev;
        tail.prev.next = cur;
        tail.prev = cur;
    }
    private void movetotail (DNode cur){
        remove(cur);
        add(cur);
    }
    private int size;
    private int capacity;
    private HashMap<Integer,DNode> map;
    private DNode head, tail;
    
    public LRUCache(int capacity) {
        this.capacity = capacity;
        head = new DNode();
        tail = new DNode();
        head.next = tail;
        tail.prev = head;
        map = new HashMap<Integer,DNode>();
        size = 0;
    }
    
    public int get(int key) {
        if (!map.containsKey(key)) {
            
            return -1;
        }
        DNode node = map.get(key);
        movetotail(node);
        return node.value;
        
    }
    
    public void set(int key, int value) {
        if (map.containsKey(key)){
            DNode cur = map.get(key);
            cur.value = value;
            map.put(key,cur);
            movetotail(cur);
        }
        else{
            DNode node = new DNode();
            node.key = key;
            node.value = value;
            map.put(key,node);
            add(node);
            size++;
            if (size>capacity){
                DNode removed = head.next;
                remove(removed);
                map.remove(removed.key);
                size--;
            }
        }
    }
}