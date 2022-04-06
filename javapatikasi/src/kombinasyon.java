import java.util.Scanner;

public class kombinasyon {
    public static void main(String[] args) {
        int n,r,factorieln=1,factorielr=1,factorielnr=1,cnr;
        Scanner inp=new Scanner(System.in);
        System.out.print("Sayı giriniz:");
        n=inp.nextInt();
        for (int i=1; i<=n;i++){
            factorieln*=i;
        }
        System.out.print("İkinci sayıyı giriniz:");
        r=inp.nextInt();
        for (int j=1; j<=r;j++){
            factorielr*=j;
        }
        for (int k=1; k<=n-r;k++){
            factorielnr*=k;
        }

        cnr=factorieln/(factorielnr*factorielr);
        System.out.print(n+"'nin"+r+"li kombinasyonu:"+cnr);


    }
}
