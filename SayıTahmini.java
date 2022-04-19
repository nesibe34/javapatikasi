import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SayıTahmini {
    public static void main(String[] args) {
        Random rand=new Random();
        int number=rand.nextInt(100);
        // int number=(int) (Math.random()*100);
        Scanner inp=new Scanner(System.in);
        int right=0;
        int select;
        int[] wrong=new int[5];
        boolean isWin=false;
        boolean isFail=false;
        while (right<5){
            System.out.println("Lütfen tahmininizi girirniz:");
            select=inp.nextInt();
            if (select<0 || select>99){
                System.out.println("lütfen 0 ile 100 arasında değer giriniz.");
                if (isFail) {
                    right++;
                    System.out.println("Çok fazla hatalı giriş yaptınız.Kalan hak:" + (5 - right));
                }else {
                isFail=true;
                    System.out.println("Bir dahaki hatalı girişte hakkınızdan düşülecektir.Kalan hak:" + (5 - right));
                }
                continue;
            }
            if (select==number){
                System.out.println("Tebrikler, doğru tahmin.");
                isWin=true;
                break;
            }else {
                wrong[right]=select;
                right++;
                System.out.println("YANLIŞ tahmin!");
                if(select>number){
                    System.out.println(select+"sayısı, gizli sayıdan büyüktür.");
                }else {
                    System.out.println(select+"sayısı, gizli sayıdan küçüktür.");
                }
            }
            System.out.println("Kalan hakkınız:"+(5-right));
        }
        if (!isWin){
            System.out.println("Oyunu KAYBETTİNİZ!");
            if (!isFail) {
                System.out.println("YANLIŞ tahminleriniz:"+ Arrays.toString(wrong));

            }
        }
    }
}
