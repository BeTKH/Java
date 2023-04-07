package MoshAdvancedJavaForEnterPriseApplications.ThrowingExceptions;

import java.io.IOException;

public class ThrowingExceptionDemo {

    public static void show(){

        var account = new Account();

        try {

            account.deposit(1);

        } catch (IOException e) {

            e.printStackTrace();
        }
        System.out.println("amount deposited!");
    }
}
