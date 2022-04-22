import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        double area;
        double pi=3.14;
        Scanner inp=new Scanner(System.in);
        System.out.println("Daire diliminin yarıçap uzunluğunu ve merkez açı ölçüsünü giriniz:");
        int r= inp.nextInt();
        int alfa=inp.nextInt();
        area=pi*(r*r)*alfa/360;
        System.out.println("Daire diliminin alanı: "+area);
    }
}
//Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
//𝜋 sayısını = 3.14 alınız.
//Formül : (𝜋 * (r*r) * 𝛼) / 360