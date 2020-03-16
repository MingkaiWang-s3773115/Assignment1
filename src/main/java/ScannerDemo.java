import java.util.Scanner;


/**
 * Methods from: https://www.geeksforgeeks.org/why-is-scanner-skipping-nextline-after-use-of-other-next-functions/
 */
public class ScannerDemo {


    public static void nextLineIssues() {
        // Declare the object and initialize with
        // predefined standard input object
        Scanner sc = new Scanner(System.in);

        // Taking input
        String name = sc.nextLine();
        char gender = sc.next().charAt(0);
        int age = sc.nextInt();
        String fathersName = sc.nextLine();
        String mothersName = sc.nextLine();

        // Print the values to check
        // if the input was correctly obtained.
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Dad's Name: " + fathersName);
        System.out.println("Mom's Name: " + mothersName);
    }



    public static void solvedNextLineIssues() {
        // Declare the object and initialize with
        // predefined standard input object
        Scanner sc = new Scanner(System.in);

        // Taking input
        String name = sc.nextLine();
        char gender = sc.next().charAt(0);

        // Consuming the leftover new line
        // using the nextLine() method
        sc.nextLine();

        // reading the complete line for the integer
        // and converting it to an integer
        int age = Integer.parseInt(sc.nextLine());

        String fathersName = sc.nextLine();
        String mothersName = sc.nextLine();

        // Print the values to check
        // if the input was correctly obtained.
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Dad's Name: " + fathersName);
        System.out.println("Mom's Name: " + mothersName);
    }




}
