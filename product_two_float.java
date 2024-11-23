// product of two float points numbere

import java.util.Scanner;

public class product_two_float {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("entrer the float point number 1 :");
        float n1 = scanner.nextFloat();
        System.out.println("entrer the float point number 1 :");
        float n2 = scanner.nextFloat();

        double d1 = n1 * n2;
        System.out.println("the product of two float points numbere : " + d1);

    }
}
