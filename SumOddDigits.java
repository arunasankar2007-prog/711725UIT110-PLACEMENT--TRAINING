import java.util.Scanner;

public class SumOddDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        num = Math.abs(num);
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;

            if (digit % 2 != 0) {
                sum = sum + digit;
            }

            num = num / 10;
        }

        System.out.println("Sum of odd digits = " + sum);

        sc.close();
    }
}
