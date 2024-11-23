
// convert fehrnhit to celsius
import java.util.Scanner;

public class feranhitToCelsious {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the feranhit  : ");
        float f = scanner.nextFloat();

        double C = (f - 32) * 5 / 9;
        System.out.println("the celsius is : " + C);
    }
}