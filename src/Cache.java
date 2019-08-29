import java.util.HashMap;
//LRU algorithm
public class Cache{
    //private HashMap<String, CacheNode> cashElements;
    private CacheMap cashElements;
    private final int capacity;
    private CacheNode head;
    private CacheNode tail;

    public Cache(int capacity) {
        this.capacity = capacity;
        //cashElements = new HashMap();
        cashElements = new CacheMap();
        head = null;
        tail = null;
    }

    public void putAsHead(CacheNode node){ //check if its correct!
        if(head != null){
            head.setPrev(node);
            node.setPrev(null);
            node.setNext(head);
            head = node;
        }

        else{
            head = node;
            tail = node;
        }

            
    }

    public void moveToHead(CacheNode node){
        if (node == head) return;
        node.getPrev().setNext(node.getNext());
        if(node.getNext() != null)
            node.getNext().setPrev(node.getPrev());
        else
            tail = node.getPrev();
        putAsHead(node);
    }

    public void removeTail(){
        cashElements.remove(tail.getKey());
        tail = tail.getPrev();
        tail.setNext(null);

    }

    public void put(String key, String value){
        if(cashElements.containsKey(key)){
            CacheNode temp = (CacheNode) cashElements.get(key);
            temp.setValue(value);//maybe wrong!
            moveToHead((CacheNode) cashElements.get(key));
            return;
        }
        CacheNode created = new CacheNode(key, value);
        if(cashElements.size() >= capacity ){
            removeTail();
            putAsHead(created);
        }
        else
            putAsHead(created);
        cashElements.put(key, created);
    }

    public CacheNode get(String key){
        if(cashElements.containsKey(key)) {
            moveToHead((CacheNode) cashElements.get(key));
            return(CacheNode) cashElements.get(key);
        }
        else return null;

    }

}
