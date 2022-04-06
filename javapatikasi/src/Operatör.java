public class Operatör {
    public static void main(String[] args) {
        int A = 10;
        int B = 20;
        int C = 10;
        int D = 40 ;
        System.out.println(A==B);
        System.out.println(A==C);
        System.out.println(A!=D);
        System.out.println(A!=C);
        System.out.println(A<=C);
        boolean kosul1= (A<B);
        boolean kosul2= (A>C);
        boolean sonuc=kosul1&&kosul2;
        System.out.println("sonuç:"+sonuc);
        if(sonuc) {
            System.out.println("doğru");
        }   else{
                System.out.println("yanlış");
        }



    }
}
