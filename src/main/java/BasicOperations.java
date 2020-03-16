import java.text.DecimalFormat;
import java.util.concurrent.ThreadLocalRandom;


public class BasicOperations {


    public static int calculateModule(int number, int mod) {
        return number % mod;
    }



    public static int calculateFibonacciNumber(int n) {
        if (n <= 1) return n;
        return calculateFibonacciNumber(n - 1) + calculateFibonacciNumber(n - 2);
    }




    public static String formatDouble(double number) {
        DecimalFormat df = new DecimalFormat("#.##");
        String formatted = df.format(number);
        return formatted;
    }



    public static int randomIntBetween(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max +1);
    }



}
