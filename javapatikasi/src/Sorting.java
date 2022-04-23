import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Sıralanacak üç sayı giriniz:");
        int num1= inp.nextInt();
        int num2= inp.nextInt();
        int num3= inp.nextInt();
        if (num1<num2){
            if (num2<num3){
                System.out.println(num1+" < "+" < "+num2+" < "+num3);
            }
            else{
                System.out.println(num1+" < "+" < "+num3+" < "+num2);
            }
        }
        if (num2<num1){
            if (num1<num3){
                System.out.println(num2+" < "+" < "+num1+" < "+num3);
            }
            else{
                System.out.println(num2+" < "+" < "+num3+" < "+num1);
            }
        }
        if (num3<num1){
            if (num1<num2){
                System.out.println(num3+" < "+" < "+num1+" < "+num2);
            }
            else{
                System.out.println(num3+" < "+" < "+num2+" < "+num1);
            }
        }
    }
}
