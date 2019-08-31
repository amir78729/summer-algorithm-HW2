import java.io.Serializable;
public class LFUCache implements Serializable {
    private static int capacity;
    private static CacheMap cacheMap;

    public LFUCache(int capacity) {
        this.capacity = capacity;
        cacheMap = new CacheMap();
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
        System.out.println(key);
        System.out.println(cacheMap.size());
        if (cacheMap.containsKey(key)){
            LFUCacheNode temp = (LFUCacheNode) cacheMap.get(key);
            temp.setFrequency(temp.getFrequency() + 1);
            cacheMap.put(key, temp);
            return temp.getValue();
        }
        return null;
    }

    private String getLFUkey(){
        int minFreq = Integer.MAX_VALUE;
        LFUCacheNode temp = null;
        for(Object node : cacheMap.getNodes()) {
            LFUCacheNode tempNode = (LFUCacheNode) node;
            if (tempNode.getFrequency() < minFreq) {
                minFreq = tempNode.getFrequency();
                temp = tempNode;
            }
        }
        return temp.getKey();
    }

    public void getSize(){
        System.out.println(cacheMap.size());
    }

    public CacheMap getCacheMap() {
        return cacheMap;
    }

    public static void setCacheMap(CacheMap cacheMap) {
        if(cacheMap == null)
            cacheMap = new CacheMap();
        LFUCache.cacheMap = cacheMap;
    }

}
