
// calculate the simple interest rate 
import java.util.Scanner;

public class simpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the principal of amount : ");
        float principal = scanner.nextFloat();
        System.out.println("enter the interest rate of amount : ");
        float rate = scanner.nextFloat();
        System.out.println("enter how many years of you borrowed the money : ");
        float years = scanner.nextFloat();

        double interest = (principal * rate * years) / 100;

        System.out.println("the simple interest rate is  : " + interest);
    }
}
