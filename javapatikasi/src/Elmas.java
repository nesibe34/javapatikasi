import java.util.Scanner;

public class Elmas {
    public static void main(String[] args) {
        int n;
        Scanner inp = new Scanner(System.in);
        System.out.println("Sayı giriniz:");
        n = inp.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }
        for (int m = n-1; m >=1; m--) {
            for (int j =1 ; j<=n-m; j++) {
                System.out.print(" ");
            }
            for (int t = 1; t <= (2 * m - 1); t++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}