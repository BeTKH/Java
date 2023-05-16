package AdvancedJavaTopics.MoshAdvancedJavaForEnterPriseApplications.Collections;

import AdvancedJavaTopics.MoshGenerics.sGoodMethodUsingGeneric.GenericList;

public class IterablesMain {

    public static void main(String[] args) {

        GenericList<String> list = new GenericList<String>();


        list.add("a");
        list.add("b");

        list iterator = list.iterator();


        /**
         * iterate over iterator without knowing anything about the implementation details of the list
         *
         *          [a,b,c]
         *           ^
         *
         * the iterator is like a pointer, points to list items iteratively
         * */

        while (iterator.hasNext()){
            var current = iterator.next();
            System.out.println(current);
        }
    }
}
