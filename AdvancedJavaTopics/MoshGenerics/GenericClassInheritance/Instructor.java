package AdvancedJavaTopics.MoshGenerics.GenericClassInheritance;

import AdvancedJavaTopics.MoshGenerics.comparableInterface.User;

public class Instructor extends User {


    public Instructor(int points_){

        // pass the value to the constructor of base value
        super(points_);
    }
}
