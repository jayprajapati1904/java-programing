// calculate the grade based on the percentage 

import java.util.Scanner;

public class SchoolGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the percentage to get the grade :");
        int num = scanner.nextInt();

        if (num > 90) {
            System.out.println("your grade is : A");

        } else if (num > 75) {
            System.out.println("your grade is : B");
        } else if (num > 60) {
            System.out.println("your grade is : C");
        } else if (num > 30) {
            System.out.println("your grade is : D");
        } else if (num < 30) {
            System.out.println("you are fail ");
        } else {
            System.out.println("please enter valid percentage");
        }
    }
}
