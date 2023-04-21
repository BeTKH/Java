package AdvancedJavaTopics.MoshGenerics.sGoodMethodUsingGeneric;

public class GenericList<T> {

    private T[] items = (T[]) new Object[10];
    private int count;

    public void add(T item_){
        items[count++] = item_;
    }

    public T get(int index_){
        return items[index_];
    }
}
