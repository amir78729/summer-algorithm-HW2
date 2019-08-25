public class HashLink {
    private String key;
    private String value;
    private HashLink next;

    public HashLink(String key, String value) {
        this.key = key;
        this.value = value;
        this.next = null;
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

    public HashLink getNext() {
        return next;
    }

    public void setNext(HashLink next) {
        this.next = next;
    }
}
