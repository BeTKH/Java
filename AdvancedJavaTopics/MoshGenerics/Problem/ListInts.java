package AdvancedJavaTopics.MoshGenerics.Problem;

/*class for listing Integers*/

/**
 *
 * PROBLEM:
 * How can we use this list to store different data types ?
 * (primitives as well as reference types)
 *
 *
 * */
public class ListInts {

    private int[] items = new int[10];
    private int count;


    public void addItem(int item_){
        items[count] = item_;
    }

    public int getItem(int index_){
        return items[index_];
    }
}
