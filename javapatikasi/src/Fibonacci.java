import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int n,f1=0,f2=1,f3=0;
        Scanner inp=new Scanner(System.in);
        n= inp.nextInt();
        System.out.print(f1+" "+f2);
        for(int i=2;i<=n;i++){
            f3=f1+f2;
            System.out.print(" "+f3);
            f1=f2;
            f2=f3;

        }

    }
}

