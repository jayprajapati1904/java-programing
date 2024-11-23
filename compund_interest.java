
// calulate the compund intrest
import java.util.Scanner;

public class compund_interest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the principal of amount : ");
        float P = scanner.nextFloat();
        System.out.println("enter the interest rate of amount : ");
        float rate = scanner.nextFloat();
        System.out.println("enter how many years of you borrowed the money : ");
        float T = scanner.nextFloat();

        double interest = (P * Math.pow(1 + rate / 100, T));

        System.out.println("the compund interest rate is  : " + interest);
    }
}
