import java.util.Scanner;

public class FirstDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        num = Math.abs(num);

        while (num >= 10) {
            num = num / 10;
        }

        System.out.println("First digit = " + num);

        sc.close();
    }
}
