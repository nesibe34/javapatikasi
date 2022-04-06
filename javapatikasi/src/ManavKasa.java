import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        double elma, armut, domates,muz,patlican,tutar;

        Scanner input=new Scanner(System.in);
        System.out.println("Armut kaç kilo:");
        armut= input.nextDouble();
        System.out.println("Elma kaç kilo:");
        elma= input.nextDouble();
        System.out.println("Domates kaç kilo:");
        domates= input.nextDouble();
        System.out.println("Muz kaç kilo:");
        muz= input.nextDouble();
        System.out.println("Patlıcan kaç kilo:");
        patlican= input.nextDouble();
        tutar=(armut*2.14)+(elma*3.67)+(domates*1.11)+(muz*0.95)+(patlican*5);
        System.out.println("Toplam tutar:"+tutar);


    }
}
