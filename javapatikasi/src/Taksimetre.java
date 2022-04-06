import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
      double tutar, mesafe;
      Scanner input=new Scanner(System.in);
      System.out.println("Alınan mesafe:");
      mesafe=input.nextDouble();
      tutar=10+2.20*mesafe;
      tutar =(tutar<20) ? 20:tutar;

      System.out.println("toplam tutar:"+tutar);



    }
}
