import java.util.Scanner;

public class HarmonicSerie {
    public static void main(String[] args) {
        int n;
        double result=0;
        Scanner inp=new Scanner(System.in);
        System.out.print("n sayısını giriniz:");
        n=inp.nextInt();
        for (double i=1;i<=n;i++){
          result+=(1/i);
        }
        System.out.print("Harmonik seri:"+result);
    }
}
