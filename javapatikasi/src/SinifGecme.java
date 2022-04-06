import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {
        int mat,fiz,turkce,kimya,muzik;
        Scanner inp=new Scanner(System.in);
        System.out.print("matematik notunuz:");
        mat=inp.nextInt();
        System.out.print("fizik notunuz:");
        fiz=inp.nextInt();
        System.out.print("türkçe notunuz:");
        turkce=inp.nextInt();
        System.out.print("kimya notunuz:");
        kimya=inp.nextInt();
        System.out.print("müzik notunuz:");
        muzik=inp.nextInt();

        if (mat<0 || mat>100){
            mat=0;
        }
        if (fiz<0 || fiz>100){
            fiz=0;
        }
        if (kimya<0 || kimya>100){
            kimya=0;
        }
        if (turkce<0 || turkce>100){
            turkce=0;
        }
        if (muzik<0 || muzik>100){
            muzik=0;
        }
        double average=(mat+fiz+turkce+kimya+muzik)/5;
        if (average<=55){
            System.out.println("Sınıfta kaldınız,seneye tekrar görüşmek üzere:(");
        }else{

            System.out.println("Tebrikler sınıfı geçtiniz:)");
        }

        System.out.print("ortalamanız:"+average);


    }
}
