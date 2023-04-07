package MoshAdvancedJavaForEnterPriseApplications.Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionsDemo {

    public static void show(){


        // alt + enter - surround with try-catch

        try {
            var reader = new FileReader("file.txt");

        } catch (FileNotFoundException e) {
            e.getMessage();
        }

    }
}
