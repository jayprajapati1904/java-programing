// given year is leap year or not 

import java.util.Scanner;

public class leepYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the year to che the year is leap year or not : ");
        int year = scanner.nextInt();

        if (year % 4 == 0) {
            System.out.println("the given year " + year + " is leap year");

        } else {
            System.out.println("the given year " + year + " is not a leap year");
        }
    }
}
