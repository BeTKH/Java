package MoshAdvancedJavaForEnterPriseApplications.Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionsDemo {

    public static void show(){


        // alt + enter - surround with try-catch

        try {

            var reader = new FileReader("file.txt");
            var value = reader.read();
            new SimpleDateFormat().parse("");


        } catch (IOException | ParseException e) {    // combining multiple exceptions
            //e.printStackTrace();
            System.out.println("Could not read data");
    }
}
}
