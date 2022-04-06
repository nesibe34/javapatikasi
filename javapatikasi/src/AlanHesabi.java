import java.util.Scanner;

public class AlanHesabi {
    public static void main(String[] args) {
        int kenar1, kenar2,kenar3;
        double alan,cevre,u;
        Scanner girdi=new Scanner(System.in);
        System.out.println("lütfen üçgenin kenar uzunlukarını giriniz:");
        kenar1= girdi.nextInt();
        kenar2= girdi.nextInt();
        kenar3= girdi.nextInt();

        cevre=kenar1+kenar2+kenar3;
        u=cevre/2;
        alan=Math.sqrt( u*(u-kenar1)*(u-kenar2)*(u-kenar3));

        System.out.println("alan:"+alan );
        System.out.println("çevre:"+cevre);

    }
}
