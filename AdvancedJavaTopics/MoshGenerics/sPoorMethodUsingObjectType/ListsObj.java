package AdvancedJavaTopics.MoshGenerics.sPoorMethodUsingObjectType;

public class ListsObj {

    private Object[] items = new Object[10];
    private int count;


    public void addItem(Object item_){
        items[count] = item_;
    }

    public Object getItem(int index_){
        return items[index_];
    }
}
