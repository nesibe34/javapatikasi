import java.util.Scanner;

public class ucakbileti {
    public static void main(String[] args) {
        int dist,age,type;
        double total=0;
        Scanner inp=new Scanner(System.in);
        System.out.println("Lütfen gidilecek mesafeyi km cinsinden giriniz:");
        dist= inp.nextInt();
        System.out.println("Lütfen yaşınızı giriniz:");
        age= inp.nextInt();
        System.out.println("Lütfen yolculuk tipini seçiniz:");
        System.out.println("1)Tek Yön\n2)Gidiş-Dönüş");
        type= inp.nextInt();
        boolean check=type==1 || type==2;
        if(dist>0 && age>0 && check){
            switch (type){
                case 1:
                    total=dist*0.10;
                    break;
                case 2:
                    total=dist*0.20;
                    total=total*0.8;
                    break;
            }
            if (age<=12){
                total=total/2;
            }else if (age>12 && age<=24){
                total=total*0.9;
            }else if (age>65){
                total=total*0.7;
            }
            System.out.println("Toplam tutar:"+total);
        }
        else{
            System.out.println("Hatalı giriş yaptınız!");
        }
    }
}
