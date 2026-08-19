import java.util.Scanner;

public class RemoveLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int result = num / 10;

        System.out.println("After removing last digit = " + result);

        sc.close();
    }
}
