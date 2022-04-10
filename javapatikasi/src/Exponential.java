import java.util.Scanner;

public class Exponential {
    static int exp(int x,int y) {
        if (y==1){
            return x;
        }
        if(y==0){
            return 1;
        }
       return exp(x,y-1)*x;
        }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter base:");
        int base = scan.nextInt();
        System.out.print("Enter exponent:");
        int exponent = scan.nextInt();
        System.out.println(base+" to the power of "+exponent+" :  "+exp(base,exponent));

    }
}
