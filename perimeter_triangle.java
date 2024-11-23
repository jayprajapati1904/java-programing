// calculate the the perimeter of triangles

import java.util.Scanner;

public class perimeter_triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the base of the tringle : ");
        float base = scanner.nextFloat();
        System.out.println("enter the height of the tringle :  ");
        float height = scanner.nextFloat();

        double f = (float) 1 / 2 * base * height;
        System.out.println("the perimeter of the tringle is : " + f);
    }
}
