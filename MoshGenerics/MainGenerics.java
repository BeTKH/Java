package MoshGenerics;

import MoshGenerics.Problem.ListInts;
import MoshGenerics.sPoorMethodUsingObjectType.ListsObj;

public class MainGenerics {

    public static void main(String[] args) {

        ListInts listINT = new ListInts();

        listINT.addItem(1);
        int val = listINT.getItem(0);
        System.out.println("listINT is: "+val);

        // The problem:
        // we can't add strings -- our listINT accommodates only int
        //listINT.addItem("x");




        // poorSolution - using object type

        ListsObj lsOBJ = new ListsObj();
        lsOBJ.addItem(1);
        lsOBJ.addItem("x");



        /**
         * problem-1: data type incompatibility
         *
         * getItem() returns an object, not an int
         *
         * if we don't cast, we'll face data incompatibility
         *
         * we can do casting, but run-time error occurs
         *
         *
         * */

        //int intValue = (int)lsOBJ.getItem(0); // throws  run-time error, also throws compile-time error not casted
        //System.out.println("intValue:"+intValue);




        /**
         * problem-2: data type incompatibility
         *
         * we could  do casting but loss of data occurs, we get null
         * String stringValue =lsOBJ.getItem(1)
         *
         * */

        String stringValue = (String) lsOBJ.getItem(1);
        System.out.println("stringValue is: "+stringValue);


        /**
         * solution: Generic classes!
         * */


    }
}
