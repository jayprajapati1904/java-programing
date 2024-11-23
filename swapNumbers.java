public class swapNumbers {
    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 2;

        // before swap the values
        System.out.println("the value of n1 is : " + n1 + "\nand" + " the value of n2 is : " + n2);

        int temp;
        temp = n1;
        n1 = n2;
        n2 = temp;

        // AFTER swap the values
        System.out.println("the value of n1 is : " + n1 + "\nand" + " the value of n2 is : " + n2);
    }
}
