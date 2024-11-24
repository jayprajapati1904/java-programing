// compute the sum of digits of the number

package methods;

public class sumofDigits {
    public static void main(String[] args) {
        int n = 345;
        sumof_Digits(n);

    }

    public static void sumof_Digits(int n) {
        int sum = 0;
        while (n > 0) {
            int num = n % 10;
            sum += num;
            n /= 10;
        }
        System.out.println(sum);

    }

}
