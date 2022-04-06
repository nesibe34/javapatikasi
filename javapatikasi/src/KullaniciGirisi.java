import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String userName,sifre,yeniSifre;
        int secim;
        Scanner inp = new Scanner(System.in);
        System.out.print("Kullanıcı adını giriniz:");
        userName = inp.nextLine();


        if (userName.equals("patika")) {
            System.out.print("Şifrenizi giriniz:");
            sifre = inp.nextLine();
            if (sifre.equals("java101")) {
                System.out.println("Sisteme giriş yaptınız.");
            }else{
                System.out.println("Şifreniz yanlış\n1-Şifreyi sıfırla.\n2-İşlemi iptal et.");
                secim = inp.nextInt();
                if(secim==1) {
                        System.out.println("yeni şifreyi giriniz:");
                        inp=new Scanner(System.in);
                        yeniSifre = inp.nextLine();
                        if (yeniSifre.equals("java101")) {
                            System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                        } else {
                            System.out.println("Şifre oluşturuldu.");
                        }
                }else {
                    System.out.print("İşlem iptal edildi.");
                }
            }

        }else {System.out.println("Kullanıcı adı geçerli değil!");
        }
    }
}



//Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
// eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve
// unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip , şifreler aynı ise ekrana
// "Şifre oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.