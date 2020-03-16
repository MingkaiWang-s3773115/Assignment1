import java.util.Arrays;

/**
 * Methods from: https://github.com/eugenp/tutorials/blob/master/core-java-modules/core-java-arrays/src/main/java/com/baeldung/array/SumAndAverageInArray.java
 */
public class SumAndAverageInArray {

    public static int findSumWithoutUsingStream(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += Math.abs(value);
        }
        return sum;
    }

    public static int findSumUsingStream(int[] array) {
        return Arrays.stream(array).sum();
    }



    public static int findSumUsingStream(Integer[] array) {
        return Arrays.stream(array).mapToInt(Integer::intValue).sum();
    }



    public static double findAverageWithoutUsingStream(int[] array) {
        int sum = findSumWithoutUsingStream(array);
        return Math.abs( (double) sum / array.length );
    }



    public static double findAverageUsingStream(int[] array) {
        return Arrays.stream(array).average().orElse(Double.NaN);
    }
}