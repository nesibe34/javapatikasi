import java.awt.*;
import java.util.Scanner;

public class sinav {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        String cevap1,cevap2,cevap3;
        int dogru=0,yanlis=0;

        System.out.println("Soru1: lnx'in türevi nedir?");
        System.out.println("a) 1/x\nb) x\nc) x^2 \nd) e^x");
        System.out.print("cevap=");
        cevap1=inp.nextLine();
        if (cevap1.equals("a")){
            System.out.println("cevap doğru");
            dogru+=1;
        }else{
            System.out.println("cevap YANLIŞ!");
            yanlis+=1;
        }
        System.out.println("Soru2: 2^x'in türevi nedir?");
        System.out.println("a) 2x\nb) 2^x.ln2\nc) x^2 \nd) 2^x");
        System.out.print("cevap=");
        cevap2=inp.nextLine();
        if (cevap2.equals("b")){
            System.out.println("cevap doğru");
            dogru+=1;
        }else{
            System.out.println("cevap YANLIŞ!");
            yanlis+=1;
        }
        System.out.println("Soru3: x^2'in türevi nedir?");
        System.out.println("a) 2+x\nb) 2^x.ln2\nc) 2x \nd) 2^x");
        System.out.print("cevap=");
        cevap3=inp.nextLine();
        if (cevap3.equals("c")){
            System.out.println("cevap doğru");
            dogru+=1;
        }else{
            System.out.println("cevap YANLIŞ!");
            yanlis+=1;
        }

        System.out.println("doğru:"+dogru);
        System.out.println("yanlış:"+yanlis);

         double puan=dogru*100/3;
        System.out.println("Başarı puanınız:"+puan);


    }
}
