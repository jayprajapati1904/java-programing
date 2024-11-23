
// calculate the perimeter of rectangle 
import java.util.Scanner;

public class perimeter_rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the length of rectangle : ");
        float length = scanner.nextFloat();
        System.out.println("enter the width of rectangle : ");
        float width = scanner.nextFloat();

        double n = 2 * (length + width);
        System.out.println("the perimeter of rectangle : " + n);
    }
}
