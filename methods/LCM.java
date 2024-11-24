// find the least common multiple of two numbers

package methods;

public class LCM {
    public static void main(String[] args) {
        int n1 = 15;
        int n2 = 20;

        lcm(n1, n2);
    }

    public static void lcm(int n1, int n2) {
        int n = 1;
        while (n < n1) {
            int fact = n1 * n;
            if (fact % n2 == 0) {
                System.out.println("the LCM of " + n1 + " and " + n2 + " is : " + fact);
            }
            n++;
        }
    }

}
