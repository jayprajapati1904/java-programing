
// categorize the person on the age based 
import java.util.Scanner;

public class person {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the age of the person :");
        int age = scanner.nextInt();

        if (age < 13) {
            System.out.println("the person is child");
        } else if (age < 20) {
            System.out.println("the person is teenager");
        } else if (age < 60) {
            System.out.println("the person is Adult");
        } else if (age > 60) {
            System.out.println("the person id senior");
        } else {
            System.out.println("enter the valid age!!!");
        }
    }
}
