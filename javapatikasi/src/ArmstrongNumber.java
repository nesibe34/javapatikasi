import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int number,tempNumber,digitcounter=0,digitvalue;
        System.out.print("Sayı giriniz:");
        number= inp.nextInt();
        tempNumber=number;
        while(tempNumber!=0){
            tempNumber=tempNumber/10;
            digitcounter++;
        }

        tempNumber=number;
        int result=0;
        while(tempNumber!=0){
            digitvalue=tempNumber%10;
            tempNumber=tempNumber/10;
               int exp=1;
               for (int i=1;i<=digitcounter;i++){
                   exp*=digitvalue;
               }
               result+=exp;
        }
        System.out.println(result);


    }
}
