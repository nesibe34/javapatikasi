import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int num,counter,max=0,min=0;
        System.out.print("Kaç tane sayı gireceksiniz:");
        counter=inp.nextInt();

        if (counter>=2) {
            for (int i=1;i<=counter;i++) {
            System.out.print(i + ".sayıyı giriniz:");
            num = inp.nextInt();

                if (i == 1) {
                    max = num;
                    min = num;
                } else {
                    if (num > max) {
                        max = num;
                    }
                    if (num < min) {
                        min = num;
                    }
                }

            }
            System.out.println("En büyük sayı:" + max);
            System.out.println("En küçük sayı:" + min);
        }else{
            System.out.print("Geçersiz sayı girdiniz:");
        }
    }
}
