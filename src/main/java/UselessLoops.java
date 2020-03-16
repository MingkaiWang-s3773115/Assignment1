import java.util.ArrayList;
import java.util.List;


/**
 * Methods from: https://www.geeksforgeeks.org/foreach-loop-vs-stream-foreach-vs-parallel-stream-foreach/
 */
public class UselessLoops {

    public static String frechlop(String[] geek) {
        int count = 0;
        for (int i = 0; i < geek.length; i++) {
            String var = geek[i];
            if (count == 1) return var;
            count++;
        }
        return "";
    }



    static String second(List<String> list) {
        list.stream().forEach( s -> {
                            // The next line will throw error
                            // as no return allowed
                            // if(s=="For")return s;
                        });
        return "null";
    }




    public static void usingParallelStream() {
        List<String> arr1 = new ArrayList<String>();
        arr1.add("Software");
        arr1.add("Engineering");
        arr1.add("Fundamentals");
        arr1.parallelStream().forEach(s -> {System.out.print(s); });
    }

}
