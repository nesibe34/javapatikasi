import java.util.Scanner;

public class KdvTutari {
    public static void main(String[] args) {

        double para, kdvTutari, tutar, kdvOrani = 0.18;


        Scanner inp=new Scanner(System.in);

        System.out.println("Para miktarını giriniz:");
        para= inp.nextDouble();

        kdvOrani=(para>1000) ?0.8: 0.18;


        kdvTutari=para*kdvOrani;
        tutar=para+kdvTutari;
        System.out.println("KDV oranı:"+kdvOrani);
        System.out.println("KDVsiz fiyat:"+para);
        System.out.println("KDVli fiyat:"+tutar);
        System.out.println("KDV tutarı:"+kdvTutari);



    }
}
