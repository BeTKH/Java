package AdvancedJavaTopics.MoshGenerics;

import AdvancedJavaTopics.MoshGenerics.GenericMethods.Utils;
import AdvancedJavaTopics.MoshGenerics.comparableInterface.User;

public class MainGenericMethods {

    public static void main(String[] args) {

        var maxValue = Utils.max(1, 5);
        System.out.println("The maxValue is: "+maxValue);

        var maxUserPts = Utils.max(new User(10), new User(20));
        System.out.println("The maxUserPts is: "+maxUserPts);




    }
}
