// the given number is odd or even check

import java.util.Scanner;

public class odd_or_even {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the number to check odd or even :");
        int n = scanner.nextInt();

        if (n % 2 == 0) {
            System.out.println("the number " + n + " even");
        } else {
            System.out.println("the number " + n + " odd");
        }
    }
}
