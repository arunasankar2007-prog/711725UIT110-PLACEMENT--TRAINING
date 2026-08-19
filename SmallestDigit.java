import java.util.Scanner;

public class SmallestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        num = Math.abs(num);
        int smallest = 9;

        if (num == 0) {
            smallest = 0;
        } else {
            while (num > 0) {
                int digit = num % 10;

                if (digit < smallest) {
                    smallest = digit;
                }

                num = num / 10;
            }
        }

        System.out.println("Smallest digit = " + smallest);

        sc.close();
    }
}
