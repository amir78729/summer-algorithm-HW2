import java.util.ArrayList;

public class CacheMap {
    private ArrayList nodes;
    private ArrayList<String> keys;
    public CacheMap() {
        nodes = new ArrayList();
        keys = new ArrayList<>();
    }

    public void put(String key, Object node){
        keys.add(key);
        nodes.add(node);
    }

    public  boolean containsKey(String key){
        return keys.contains(key);
    }

    public Object get(String key){
        int index = keys.indexOf(key);
        return nodes.get(index);
    }

    public void remove(String key){
        int index = keys.indexOf(key);
        keys.remove(key);
        nodes.remove(index);
    }

    public int size(){
        return keys.size();
    }



}
