import java.util.Scanner;




public class Hipotenus {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("lütfen kenar uzunluklarını giriniz:");
        double a,b;
        double c;
        a= inp.nextInt();
        b= inp.nextInt();
        c=Math.sqrt(a*a+b*b);
        System.out.println("hipotenüs:"+c);
    }
}
