import java.util.LinkedHashMap;

public class LFUCache {
    private static int capacity;
    private static LinkedHashMap<String, LFUCacheNode> cacheMap;

    public LFUCache(int capacity) {
        this.capacity = capacity;
        cacheMap = new LinkedHashMap<>();
    }
    public void put(String key, String value){
        if(cacheMap.size() < capacity){
             LFUCacheNode created = new LFUCacheNode(key, value);
             cacheMap.put(key, created);

        }
        else {
            cacheMap.remove(getLFUkey());
            LFUCacheNode created = new LFUCacheNode(key, value);
            cacheMap.put(key, created);
        }
    }

    public String get(String key){
        if (cacheMap.containsKey(key)){
            LFUCacheNode temp = cacheMap.get(key);
            temp.setFrequency(temp.getFrequency() + 1);
            cacheMap.put(key, temp);
            return temp.getValue();
        }
        return null;
    }

    private String getLFUkey(){
        int minFreq = Integer.MAX_VALUE;
        LFUCacheNode temp = null;
        for(LFUCacheNode node : cacheMap.values())
            if(node.getFrequency() < minFreq){
                minFreq = node.getFrequency();
                temp = node;
            }
        return temp.getKey();
    }
}
