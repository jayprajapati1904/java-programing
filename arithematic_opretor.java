// perform all arithmetic operations(+, -, * , / , %)

import java.util.Scanner;

public class arithematic_opretor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number 1 :");
        int n1 = scanner.nextInt();
        System.out.println("enter the number 2 :");
        int n2 = scanner.nextInt();

        System.out.println("the addition of two numbers : " + (n1 + n2));
        System.out.println("the subtraction of two numbers : " + (n1 - n2));
        System.out.println("the product of two numbers : " + (n1 * n2));
        System.out.println("the division of two numbers : " + (n1 / n2));
        System.out.println("the modules of two numbers : " + (n1 % n2));

    }
}
