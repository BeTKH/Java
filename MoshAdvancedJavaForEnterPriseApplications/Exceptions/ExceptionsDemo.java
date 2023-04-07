package MoshAdvancedJavaForEnterPriseApplications.Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionsDemo {

    public static void show(){


        // alt + enter - surround with try-catch

        try {

            var reader = new FileReader("file.txt");
            var value = reader.read();

        } catch (FileNotFoundException e) {   // catch block  for FileReader()
            e.getMessage();                   // catch block  for .read()

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
