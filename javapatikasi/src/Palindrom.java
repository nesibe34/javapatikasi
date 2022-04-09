import java.util.Scanner;

public class Palindrom {
    static boolean isPalindrom(int num){
        int temp=num,reverseNum=0,lastDigit;
        while(temp!=0){
            lastDigit=temp % 10;
            reverseNum= reverseNum*10 +lastDigit;
            temp/=10;
        }
        if(num==reverseNum)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Sayı giriniz:");
        int num=inp.nextInt();
        if (isPalindrom(num)) {
            System.out.print("Bu sayı bir PALİNDROMdur.");
        } else {
            System.out.print("Bu sayı bir PALİNDROM değildir!");
        }

    }
}
