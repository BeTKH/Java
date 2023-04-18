package MoshGenerics.MultipleTypeParams;

public class KeyValuePair<K,V> {

    private K key;
    private V value;

    public KeyValuePair(K key_, V value_){
        this.key = key_;
        this.value = value_;
    }
}
