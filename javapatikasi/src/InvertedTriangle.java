import java.util.Scanner;

public class InvertedTriangle {
    public static void main(String[] args) {
        int number;
        Scanner inp=new Scanner(System.in);
        System.out.print("Please enter a number:");
        number=inp.nextInt();
        for (int i=number;i>=1;i--){
            for (int j=0;j<=number-i;j++) {
                System.out.print(" ");
            }
            for (int k=1;k<=2*i-1;k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
