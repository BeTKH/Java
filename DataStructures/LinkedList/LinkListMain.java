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

    }
}
