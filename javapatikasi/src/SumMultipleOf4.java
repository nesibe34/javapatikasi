import java.util.Scanner;

public class SumMultipleOf4 {
    public static void main(String[] args) {
        int sum=0;
        Scanner inp=new Scanner(System.in);
        int number= inp.nextInt();
        while(number%2==0){
            if (number%4==0){
            sum+=number;
            }
            number= inp.nextInt();
        }
        System.out.println("Summation of the entered number which" +
                "is divisible by 4 is "+sum+".");


    }
}
//    Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden
//    ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.