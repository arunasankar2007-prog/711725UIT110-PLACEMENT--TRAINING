import java.util.Scanner;

public class ProductOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        num = Math.abs(num);
        int product = 1;

        if (num == 0) {
            product = 0;
        } else {
            while (num > 0) {
                int digit = num % 10;
                product = product * digit;
                num = num / 10;
            }
        }

        System.out.println("Product of digits = " + product);

        sc.close();
    }
}
