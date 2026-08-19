import java.util.Scanner;

public class ContainsZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        num = Math.abs(num);
        boolean containsZero = false;

        if (num == 0) {
            containsZero = true;
        } else {
            while (num > 0) {
                int digit = num % 10;

                if (digit == 0) {
                    containsZero = true;
                    break;
                }

                num = num / 10;
            }
        }

        if (containsZero) {
            System.out.println("The number contains 0");
        } else {
            System.out.println("The number does not contain 0");
        }

        sc.close();
    }
}
