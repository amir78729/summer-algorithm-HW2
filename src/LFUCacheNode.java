public class LFUCacheNode {
    private String key;
    private String value;
    private int frequency;

    public LFUCacheNode(String key, String value) {
        this.key = key;
        this.value = value;
        this.frequency = 0;
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

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }
}
