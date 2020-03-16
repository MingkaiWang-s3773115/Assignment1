import java.awt.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;



public class Printings {


        public static void printLocalTime() {
            // Create a LocalTime Objects
            LocalTime time = LocalTime.now();
            // Create formatter Object
            DateTimeFormatter formatter = DateTimeFormatter.ISO_TIME;
            // Apply format
            String value = time.format(formatter);
            // print result
            System.out.println("value : " + value);
        }



        public static void formattedLocalTime() {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
            System.out.println(LocalTime.now().format(dtf));
        }



        public static String getAndPrintUserDir() {
            String userDir = System.getProperty("user.dir");
            System.out.println(userDir);
            return userDir;
        }

}
