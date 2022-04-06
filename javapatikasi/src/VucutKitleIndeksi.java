import java.util.Scanner;

public class VucutKitleIndeksi {
    public static void main(String[] args) {

        double boy, kilo,indeks;
        Scanner input=new Scanner(System.in);
        System.out.print("lütfen boyunuzu metre cinsinden giriniz:");
        boy= input.nextDouble();

        System.out.print("lütfen kilonuzu kg cinsinden giriniz:");
        kilo=input.nextDouble();

        indeks=kilo/(boy*boy);

        System.out.println("vücut kitle indeksiniz:"+indeks);


    }
}
