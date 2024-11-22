import java.util.Scanner;

public class AddToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number 1 :");
        int n1 = scanner.nextInt();
        System.out.println("Enter a number 2 :");
        int n2 = scanner.nextInt();
        int addition = n1 + n2;
        System.out.println("the addition of two number is : " + addition);

    }

}
