package AdvancedJavaTopics.MoshAdvancedJavaForEnterPriseApplications.ThrowingExceptions;

import java.io.IOException;

public class ThrowingExceptionMain {

    public static void main(String[] args) {

        try {
            ThrowingExceptionDemo.show();
        } catch (IOException e) {
            System.out.println("unexpected error occured!");
        }
    }
}
