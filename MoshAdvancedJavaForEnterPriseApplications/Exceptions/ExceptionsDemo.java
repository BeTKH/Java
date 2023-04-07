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
            //e.getMessage();
            System.out.println("File does not exist");

        } catch (IOException e) {             // catch block  for .read()
            //e.printStackTrace();
            System.out.println("Could not read data");
        }

    }
}
