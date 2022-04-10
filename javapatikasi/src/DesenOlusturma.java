import java.util.Scanner;

public class DesenOlusturma {
    static void desen(int num) {
        if (num <= 0) {
            System.out.print(num + " ");
            return;
        }
        System.out.print(num + " ");
        desen(num - 5);
        System.out.print(num + " ");
    }

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int num;
            System.out.print("N sayısı : ");
            num=inp.nextInt();
            System.out.print("Çıktısı : ");
            desen(num);




    }
}
