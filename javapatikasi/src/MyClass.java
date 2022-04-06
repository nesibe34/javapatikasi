
import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.print("ifade giriniz:");
        String str;
        str=input.nextLine();
        System.out.println(str);

        System.out.print("A sayısnı giriniz:");
        int a;
        a=input.nextInt();
        System.out.println(a);


    }
}
