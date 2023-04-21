package AdvancedJavaTopics.MoshGenerics.ConstrainGenerics;

/**
 * constraints (Bounded generic type parameters) are set using:
 * - classes or
 * - interfaces (-able)
 * */
public class BoundedGenericList<T extends Number & Comparable & Cloneable> {

    private T[] items = (T[]) new Object[10];
    private int count;

    public void add(T item_){
        items[count++] = item_;
    }

    public T get(int index_){
        return items[index_];
    }
}
