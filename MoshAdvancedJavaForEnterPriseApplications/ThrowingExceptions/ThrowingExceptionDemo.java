package MoshAdvancedJavaForEnterPriseApplications.ThrowingExceptions;

import java.io.IOException;

public class ThrowingExceptionDemo {

    public static void show() throws IOException{

        var account = new Account();

        try {

            account.deposit(-1);

        } catch (IOException e) {

            System.out.println("Logging");
            throw e;
        }
        System.out.println("amount deposited!");
    }
}
