package MoshAdvancedJavaForEnterPriseApplications.ThrowingExceptions;

import java.io.IOException;

public class Account {

    public void deposit(float depositAmount) throws IOException{

        // depositAmount can't be -ve  - defensive programming
        
        if (depositAmount <= 0)

            // throwing checked exception
            throw new IOException();
    }
}
