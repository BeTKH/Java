package AdvancedJavaTopics.MoshGenerics.GenericMethods;


/**
 * generic methods in non-generic class
 *
 * Utils class - some utility methods
 * */

public class Utils {

    /**
     *  make utility methods static - good practice
     *  generic method works with different types (int, float, str, obj)
     *
     * */

    //  public static int max(int first, int second)

    public static <T extends Comparable<T>> T max(T first, T second){

        // ternary operator
        //return (first < second) ? first:second;
        return (first.compareTo(second) < 0) ? second:first;
    }
}
