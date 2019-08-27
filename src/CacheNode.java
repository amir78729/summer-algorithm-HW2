public class CacheNode {
    private String key;
    private String value;
    private CacheNode next;
    private CacheNode prev;

    public CacheNode(String key, String value) {
        this.key = key;
        this.value = value;
        this.next = null;
        this.prev = null;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public CacheNode getNext() {
        return next;
    }

    public void setNext(CacheNode next) {
        this.next = next;
    }

    public CacheNode getPrev() {
        return prev;
    }

    public void setPrev(CacheNode prev) {
        this.prev = prev;
    }
}
