// print the multiplication table using methods

package methods;

public class multiplication_table {
    public static void main(String[] args) {
        int n = 5;
        multiplication(n);

    }

    public static void multiplication(int n) {
        System.out.println("the multiplication table of " + n);
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }

    }
}
