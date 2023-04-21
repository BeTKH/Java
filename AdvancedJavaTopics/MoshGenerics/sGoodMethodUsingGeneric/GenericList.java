package AdvancedJavaTopics.MoshGenerics.sGoodMethodUsingGeneric;

import java.util.Iterator;

public class GenericList<T> implements Iterable<T>{

    public T[] items = (T[]) new Object[10];
    private int count;

    public void add(T item_){
        items[count++] = item_;
    }

    public T get(int index_){
        return items[index_];
    }


    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
