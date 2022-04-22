import java.util.Scanner;

public class PowerOf4and5 {
    public static void main(String[] args) {
        int power4=1,power5=1;
        Scanner inp=new Scanner(System.in);
        int number= inp.nextInt();
        System.out.println("Power of 4 : ");
        for (int i=1;i<=number;i*=4){
            System.out.print(i+"  ");
        }
        System.out.println();
        System.out.println("Power of 5 : ");
        for (int j=1;j<=number;j*=5){
            System.out.print(j+"  ");
        }
    }
}
//Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.