import java.util.Scanner;

public class Game {
    private Scanner inp=new Scanner(System.in);

public void start(){
    System.out.println("Macera oyununa hoşgeldiniz!");
    System.out.print("Lütfen bir isim giriniz:");
    String playerName=inp.nextLine();
    Player player=new Player(playerName);
    System.out.println("Sayın "+player.getName()+", macera adasına hoşgeldiniz!");
    System.out.println("----------------------------------------------------------------------");
    System.out.println("KARAKTERLER");
    player.selectChar();
    Location location=null;
    while (true){
        player.printInfo();
        System.out.println();
        System.out.println("******Bölgeler******");
        System.out.println();
        System.out.println("1-Güvenli Ev-->burası sizin için güvenli, düşman yok.");
        System.out.println("2-Store-->silah veya zırh satın alabilirsiniz.");
        System.out.println("3-Mağara-->Ödül <yemek>, dikkat et zombi çıkabilir.");
        System.out.println("4-Orman-->Ödül <odun>, dikkat et vampir çıkabilir.");
        System.out.println("5-Nehir-->Ödül <su>, dikkat et ayı çıkabilir.");
        System.out.println("6-Maden-->Ödül <yok>, dikkat et yılan çıkabilir.");
        System.out.println("0-Çıkış Yap-->Oyunu sonlandır.");
        System.out.print("Gitmek istediğiniz bölgeyi seçiniz:");
        int selectLoc=inp.nextInt();
        switch (selectLoc){
            case 0:
                location=null;
                break;
            case 1:
                location=new SafeHouse(player);
                break;
            case 2:
                location=new ToolStore(player);
                break;
            case 3:
                if (player.getInventory().isFood()){
                    System.out.println("------------------------------->");
                    System.out.println("Bu bölgeyi tamamladınız!");
                    System.out.println("Güvenli bölgeye yönlendiriliyorsunuz.");
                    System.out.println("------------------------------->");

                    location=new SafeHouse(player);
                    break;
                }else{
                location=new Cave(player);
                break;
                }
            case 4:
                if (player.getInventory().isFirewood()){
                    System.out.println("------------------------------->");
                    System.out.println("Bu bölgeyi tamamladınız!");
                    System.out.println("Güvenli bölgeye yönlendiriliyorsunuz.");
                    System.out.println("------------------------------->");
                    location=new SafeHouse(player);
                    break;
                }else{
                location=new Forest(player);
                break;
                }
            case 5:
                if (player.getInventory().isWater()){
                    System.out.println("------------------------------->");
                    System.out.println("Bu bölgeyi tamamladınız!");
                    System.out.println("Güvenli bölgeye yönlendiriliyorsunuz.");
                    System.out.println("------------------------------->");
                    location=new SafeHouse(player);
                    break;
                }else{
                location=new River(player);
                break;
                }
            case 6:
                location=new Mine(player);
                break;
            default:
                System.out.println("Lütfen geçerli bir bölge giriniz.");
                break;
        }
        if (location==null){
            System.out.println("GAME OVER");
            break;
        }
        if(!location.onLocation()){
            System.out.println("GAME OVER");
            break;
        }
    }
}
}


