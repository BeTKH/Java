package MoshAdvancedJavaForEnterPriseApplications.Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionsDemo {

    public static void show(){

        FileReader reader = null;

        // alt + enter - surround with try-catch
        try {

            reader = new FileReader("file.txt");
            var value = reader.read();
            new SimpleDateFormat().parse("");


        } catch (IOException | ParseException e) {    // combining multiple exceptions
            //e.printStackTrace();
            System.out.println("Could not read data");
        }
        finally {

            // release resources here, close files ... etc
            if (reader != null) {

                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
}
}
