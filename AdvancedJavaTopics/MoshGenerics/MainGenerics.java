package AdvancedJavaTopics.MoshGenerics;

import AdvancedJavaTopics.MoshGenerics.Problem.ListInts;
import AdvancedJavaTopics.MoshGenerics.sGoodMethodUsingGeneric.GenericList;
import AdvancedJavaTopics.MoshGenerics.sPoorMethodUsingObjectType.ListsObj;

public class MainGenerics {

    public static void main(String[] args) {

        ListInts listINT = new ListInts();

        listINT.addItem(1);
        int val = listINT.getItem(0);
        System.out.println("listINT using ListInts class is: "+val);

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
        System.out.println("stringValue using ListsObj class is: "+stringValue);


        /**
         * solution: Generic classes!
         *
         * Advantages of generics:
         * - type safety
         * - casting not required
         * - compile-time checking / Improved Code Readability
         * - code re-usability
         * */


        //GenericList<Integer> genListINT = new GenericList<>(); also possible
        var genListINT = new GenericList<Integer>();
        genListINT.add(1);
        genListINT.add(2);
        genListINT.add(3);

        // genListINT.add("x"); CAN'T BE APPLIED

        int genIntVal = genListINT.get(0);
        System.out.println("genIntVal using GenericList is: "+genIntVal);



        // code-reuse: we can use the generic class to create another string list
        GenericList genListSTR = new GenericList<String>();
        genListSTR.add("ball");
        genListSTR.add("x");

        var genStrVal1 = genListSTR.get(0);
        System.out.println("genStrVal1 using GenericList is: "+genStrVal1);



    }
}
