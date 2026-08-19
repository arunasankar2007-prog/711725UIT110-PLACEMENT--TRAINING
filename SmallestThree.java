import java.util.Scanner;

public class SmallestThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        if (a <= b && a <= c) {
            System.out.println("Smallest number = " + a);
        } else if (b <= a && b <= c) {
            System.out.println("Smallest number = " + b);
        } else {
            System.out.println("Smallest number = " + c);
        }

        sc.close();
    }
}
