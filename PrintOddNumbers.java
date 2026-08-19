import java.util.Scanner;

public class PrintOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i += 2) {
            System.out.println(i);
        }

        sc.close();
    }
}
