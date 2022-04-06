import java.util.Scanner;

public class ATMprojesi {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        String userName,password;
        int right=3;
        double bakiye=0;
        int select;
        while (right>0){
            System.out.print("kullanıcı adınız:");
            userName=inp.nextLine();
            System.out.print("şifreniz:");
            password=inp.nextLine();
            if (userName.equals("patika")&&password.equals("dev123")){
                System.out.println("Merhaba Math Bankasına hoşgeldiniz.");
                do {
                    System.out.println("1)Para yatırma\n" +
                            "2)para çekme\n" +
                            "3-bakiye sorgulama\n" +
                            "4-çıkış");
                    System.out.println("Lütfen işleminizi seçiniz.");
                    select=inp.nextInt();
                    switch (select){
                        case 1:
                            System.out.print("Para miktarı:");
                            int price=inp.nextInt();
                            bakiye+=price;
                            System.out.println("İşlem gerçekleştirildi.Mevcut bakiye:"+bakiye);
                            break;
                        case 2:
                            System.out.print("Para miktarı:");
                            int price2=inp.nextInt();
                            if (price2>bakiye){
                                System.out.println("Mevcut bakiye yetersiz!");
                            }else {
                                bakiye -= price2;
                                System.out.println("İşlem gerçekleştirildi.Mevcut bakiye:" + bakiye);
                            }
                            break;
                        case 3:
                            System.out.println("Mevcut bakiye:"+bakiye);
                            break;
                        case 4:
                            System.out.println("iyi günler dileriz.");

                    }


                }while (select!=4);
                    break;
            }else {
                right--;
                if (right==0){
                    System.out.println("Hesabınız bloke olmuştur.Bankanız ile görüşünüz.");
                }else {
                    System.out.println("Hatalı kullanıcı adı veya şifre!Tekrar deneyiniz.");

                    System.out.println("Kalan hakkınız:" + right);
                }
            }

        }
    }
}
