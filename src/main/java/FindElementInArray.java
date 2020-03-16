import java.util.Arrays;


/**
 * Methods from: https://github.com/eugenp/tutorials/blob/master/core-java-modules/core-java-arrays/src/main/java/com/baeldung/array/FindElementInArray.java
 */
public class FindElementInArray {


    public static boolean findGivenElementInArrayWithoutUsingStream(int[] array, int element) {
        boolean actualResult = false;

        for (int index = 0; index < array.length; index++) {
            if (element == array[index]) {
                actualResult = true;
                break;
            }
        }
        return actualResult;
    }


    public static boolean findGivenElementInArrayUsingStream(int[] array, int element) {
        return Arrays.stream(array).filter(x -> element == x).findFirst().isPresent();
    }


}
