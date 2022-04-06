import java.util.Scanner;

public class artikyil {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int yil,artikyil,artikyil2,artikyil3;
        System.out.print("Lütfen yılı giriniz:");
        yil=input.nextInt();
        artikyil=yil%4;
        artikyil2=yil%100;
        artikyil3=yil%400;
        if (artikyil2==0){
            if (artikyil3==0){
            System.out.println(yil+" bir artık yıldır.");
            }else {System.out.println(yil+" artık yıl değildir.");}}
        else if (artikyil==0){
            System.out.println(yil+" bir artık yıldır.");
        }else{
        System.out.println(yil+" artık yıl değildir.");
        }
    }
}
