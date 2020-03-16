import java.util.Scanner;
import java.util.stream.IntStream;


public class ArraysMethods {



    public int sumIntArray(int[] anArray) {
        return IntStream.of(anArray).sum();
    }



    public double sumArrayWithLoop(double[] anotherArray) {
        double value = 0.0;
        for (double v : anotherArray)
            value += v;
        return value;
    }



    /**
     * Method from: https://www.sanfoundry.com/java-program-accept-array-elements-find-sum/
     */
    public void sumScannedArray() {
        int n;
        int sum = 0;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int[] a = new int[n];

        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++) {
            a[i] = s.nextInt();
            sum += a[i];
        }

        System.out.println("Sum:" + sum);
    }





}
