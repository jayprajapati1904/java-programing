// calculate the sum of odd numbers between 1 to specified n number

package methods;

public class sum_off_oddNumbers {
    public static void main(String[] args) {
        int n = 20;
        sum_off_oddNumbers(n);
    }

    public static void sum_off_oddNumbers(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                sum += i;
            } else {
                continue;
            }
        }
        System.out.println("sum of odd numbers 1 to " + n + " is : " + sum);

    }
}
