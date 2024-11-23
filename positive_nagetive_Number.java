
// the given number is positive or negative
import java.util.Scanner;

public class positive_nagetive_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the number :");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("the given number " + n + " negative");
        } else {
            System.out.println("the given number " + n + " positive");
        }
    }
}
