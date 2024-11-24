// calulate the factorrial number 

package methods;

public class factorial {
    public static void main(String[] args) {
        int n = 5;
        factorial(n);
    }

    public static void factorial(int n) {
        int factorial = 1;
        for (int i = n; i >= 1; i--) {
            factorial *= i;
        }
        System.out.println("the factorial is " + factorial);
    }
}
