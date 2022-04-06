import java.util.Scanner;

public class cinzodyagi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int year,burc;
        System.out.print("Lütfen doğum yılınızı giriniz:");
        year= input.nextInt();
        burc=year%12;
        switch (burc){
            case 0:
                System.out.print("Çinzodyağı Burcunuz:Maymun");
                break;
            case 1:
                System.out.print("Çinzodyağı Burcunuz:Horoz");
                break;
            case 2:
                System.out.print("Çinzodyağı Burcunuz:Köpek");
                break;
            case 3:
                System.out.print("Çinzodyağı Burcunuz:Domuz");
                break;
            case 4:
                System.out.print("Çinzodyağı Burcunuz:Fare");
                break;
            case 5:
                System.out.print("Çinzodyağı Burcunuz:Öküz");
                break;
            case 6:
                System.out.print("Çinzodyağı Burcunuz:Kaplan");
                break;
            case 7:
                System.out.print("Çinzodyağı Burcunuz:Tavşan");
                break;
            case 8:
                System.out.print("Çinzodyağı Burcunuz:Ejderha");
                break;
            case 9:
                System.out.print("Çinzodyağı Burcunuz:Yılan");
                break;
            case 10:
                System.out.print("Çinzodyağı Burcunuz:At");
                break;
            case 11:
                System.out.print("Çinzodyağı Burcunuz:Koyun");
                break;

        }
    }
}
