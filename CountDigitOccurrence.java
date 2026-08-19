import java.util.Scanner;

public class CountDigitOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.print("Enter the digit to count: ");
        int digitToFind = sc.nextInt();

        num = Math.abs(num);
        int count = 0;

        if (num == 0 && digitToFind == 0) {
            count = 1;
        } else {
            while (num > 0) {
                int digit = num % 10;

                if (digit == digitToFind) {
                    count++;
                }

                num = num / 10;
            }
        }

        System.out.println("Occurrence of " + digitToFind + " = " + count);

        sc.close();
    }
}
