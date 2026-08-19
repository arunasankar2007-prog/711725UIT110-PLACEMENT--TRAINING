import java.util.Scanner;

public class CountMultiplesOf3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        int count = 0;

        for (int i = 3; i <= n; i += 3) {
            count++;
        }

        System.out.println("Count of multiples of 3 = " + count);

        sc.close();
    }
}
