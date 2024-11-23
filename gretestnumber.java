// find the gretest number off three

import java.util.Scanner;

public class gretestnumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number 1 : ");
        int n1 = scanner.nextInt();
        System.out.println("enter number 2 : ");
        int n2 = scanner.nextInt();
        System.out.println("enter number 3 : ");
        int n3 = scanner.nextInt();

        if (n1 > n2 && n1 < n3) {
            System.out.println("the " + n1 + " is gretest number");
        } else if (n2 > n3 && n2 < n1) {
            System.out.println("the " + n2 + " is gretest number");
        } else {
            System.out.println("the " + n3 + " is gretest number");
        }
    }
}
