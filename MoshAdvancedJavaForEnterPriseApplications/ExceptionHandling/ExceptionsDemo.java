package MoshAdvancedJavaForEnterPriseApplications.ExceptionHandling;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionsDemo {

    public static void show(){


        // try with resource statement - a statement with >=1 resource
        // the JAVAC will release the resource - close file- etc

        try(
                var reader = new FileReader("file.txt");
                var writer = new FileWriter("...");
        ) {

            var value = reader.read();
            new SimpleDateFormat().parse("");


        } catch (IOException | ParseException e) {    // combining multiple exceptions
            //e.printStackTrace();
            System.out.println("Could not read data");
        }

}
}
