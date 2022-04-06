import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {

        int n1,n2,gcd=1,dcm=1;
        Scanner inp=new Scanner(System.in);
        System.out.print("1. sayıyı giriniz:");
        n1= inp.nextInt();
        System.out.print("2. sayıyı giriniz:");
        n2=inp.nextInt();
        int i=n1;
        while(i!=0){
            if (n1%i==0 && n2%i==0) {
                gcd = i;
                System.out.println("EBOB:"+gcd);
                break;
            }
            i--;
        }
        int j=1;
        while (j<=n1*n2){
            if (j%n1==0 && j%n2==0){
                dcm=j;
                System.out.println("EKOK:"+dcm);
                break;
            }
            j++;
        }

    }
}
