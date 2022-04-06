import java.util.Scanner;

public class ücdortebolunensayi {
    public static void main(String[] args) {
        int k,top=0,sayac=0;
        double ort=0;
        Scanner inp=new Scanner(System.in);
        System.out.print("Sayı giriniz:");
        k= inp.nextInt();
        for (int i=0; i<=k;i++){
            if (i%3==0 && i%4==0){
                sayac++;
                top+=i;
                ort=top/sayac;
            }
        }
        System.out.println("3 ve 4 e bölünen sayıların ortalaması:"+ort);
    }
}
