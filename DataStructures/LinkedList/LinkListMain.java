package DataStructures.LinkedList;
import java.util.LinkedList;


/*
* LinkedList
* https://www.javatpoint.com/java-linkedlist
* - is a class implemented in java
* - each element knows the element before and after it
* - is ordered
* */

public class LinkListMain {

    public static void main(String[] args) {

        LinkedList<Integer> linkls = new LinkedList();

        linkls.add(3);
        linkls.add(2);
        linkls.add(4);

        System.out.println(linkls);
        System.out.println("The 2nd element is : "+linkls.get(1));

        System.out.println("size of linkedlist is: "+linkls.size());

        System.out.println("element is: "+linkls.element());

        System.out.println("contains 2: "+linkls.contains(2));

        System.out.println("get value at index 0: "+linkls.get(0));

        System.out.println("index of 4 is: "+linkls.indexOf(4));

        System.out.println("peeking: "+linkls.peekLast());
        System.out.println("linkedlist after peeking: "+linkls);



    }
}
