import java.util.Scanner;

public class CountOddDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        num = Math.abs(num);
        int count = 0;

        while (num > 0) {
            int digit = num % 10;

            if (digit % 2 != 0) {
                count++;
            }

            num = num / 10;
        }

        System.out.println("Count of odd digits = " + count);

        sc.close();
    }
}
