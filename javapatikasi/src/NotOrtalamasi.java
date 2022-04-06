import java.util.Scanner;


public class NotOrtalamasi {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce;

        Scanner inp=new Scanner(System.in);
        System.out.print("matematik notunu giriniz:");
        mat= inp.nextInt();

        System.out.print("fizik notunu giriniz:");
        fizik=inp.nextInt();

        System.out.print("kimya notunu giriniz:");
        kimya= inp.nextInt();

        System.out.print("türkçe notunu giriniz:");
        turkce= inp.nextInt();

        int toplam=mat+fizik+kimya+turkce;

        double sonuc=toplam/4.0;
        System.out.println("ortalama notunuz:"+sonuc);


        boolean basari =sonuc>60;
        //String msj=basari ? "geçti" : "kaldı";

        System.out.println(basari? "geçti":"kaldı");
    }
}
