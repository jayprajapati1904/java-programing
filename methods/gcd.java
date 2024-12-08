// write the code to calculate gcd off two number 

package methods;

import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("eneter the first number  : ");
        int first = scanner.nextInt();

        System.out.println("eneter the second number  : ");
        int second = scanner.nextInt();

        code(first, second);
        System.out.println("your gcd is : " + code(first, second));
    }

    public static int code(int num1, int num2) {
        int i = 2;
        int gcd = 1;
        int least = least(num1, num2);
        while (i <= least) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
            i++;
        }

        return gcd;

    }

    public static int least(int num1, int num2) {
        if (num1 < num2) {
            return num1;
        } else {
            return num2;
        }
    }

}