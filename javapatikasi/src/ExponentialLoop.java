import java.util.Scanner;

public class ExponentialLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter base:");
        int base = scan.nextInt();
        System.out.print("Enter exponent:");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Result : " + result);
    }

}
