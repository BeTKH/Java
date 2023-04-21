package AdvancedJavaTopics.MoshGenerics.MultipleTypeParams;

public class UtilsMultitypeParameters {


    //  public static <T> void printer(T key, int value)
    public static <K, V> void printer(K key, V value){

        System.out.println(key + "=" + value);
    }
}
