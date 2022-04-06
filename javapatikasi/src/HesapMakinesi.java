import java.util.Scanner;

public class HesapMakinesi {

    public static void main(String[] args) {
        int n1,n2,select;
        Scanner inp=new Scanner(System.in);
        System.out.println("ilk sayıyı giriniz:");
        n1= inp.nextInt();
        System.out.println("ikinci sayıyı giriniz:");
        n2= inp.nextInt();
        System.out.println("1-toplama\n2-çıkarma\n3-çarpma\n4-bölme");
        System.out.println("Seçiminiz");
        select= inp.nextInt();
        switch (select) {
            case 1:
                System.out.println("toplam:" + (n1 + n2));
                break;

            case 2:
                System.out.println("fark:" + (n1 - n2));
                break;

            case 3:
                System.out.println("çarpım:" + (n1 * n2));
                break;

            case 4:
                switch(n2) {
                    case 0:
                        System.out.println("0 ile bölme yapılamaz!");
                        break;
                    default:
                    System.out.println("bölüm:" + (n1 / n2));
                    break;
                }
                break;

            default:
                System.out.println("Hatalı giriş yaptınız!");
                break;
        }



    }
}
