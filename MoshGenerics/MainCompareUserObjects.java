package MoshGenerics;

import MoshGenerics.comparableInterface.User;

public class MainCompareUserObjects {

    public static void main(String[] args) {

        var user1 = new User(10);
        var user2 = new User(20);

        /**
         * how do we compare objects in Java ?
         *
         * we can't use >,< like numbers
         *
         * so we use .compareTo()
         * */

        if (user1.compareTo(user2) < 0)
            System.out.println("user1 < user2");

        else if (user1.compareTo(user2) == 0)
            System.out.println("user1 == user2");
        else
            System.out.println("user1 > user2");
    }
}
