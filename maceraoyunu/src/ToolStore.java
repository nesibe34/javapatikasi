public class ToolStore extends NormalLoc{
    public ToolStore(Player player){
        super(player,"Mağaza");
    }
    @Override
    public boolean onLocation(){
        System.out.println("------Mağazaya hoşgeldiniz.------");
        System.out.println("Yapmak istediğiniz işlemi seçiniz:");
        boolean showMenu=true;
        while (showMenu){
            System.out.println("1-Silahlar");
            System.out.println("2-Zırhlar");
            System.out.println("3-Çıkış");
            System.out.print("Seçiminiz:");
            int selectCase=inp.nextInt();
            while (selectCase < 1 || selectCase > 3){
                System.out.print("Geçersiz değer, tekrar giriniz:");
                selectCase=inp.nextInt();
            }
            switch (selectCase){
                case 1:
                    printWeapon();
                    buyWeapon();
                    break;
                case 2:
                    printArmor();
                    buyArmor();
                    break;
                case 3:
                    System.out.println("Yine bekleriz.");
                    showMenu=false;
                    break;
            }
        }
        return true;
    }
    public void printWeapon(){
        System.out.println("--------silahlar--------");
        for(Weapon w:Weapon.weapons()){
            System.out.println(w.getId()+" - "+w.getName()+" <Ücret: "+w.getPrice()+", Hasarı: "+w.getDamage()+">");
        }
        System.out.println("0 - Çıkış Yap");


    }
    public void buyWeapon(){
        System.out.print("Bir silah seçiniz:");
        int selectWeaponID= inp.nextInt();
        while (selectWeaponID<0 || selectWeaponID>Weapon.weapons().length){
            System.out.print("Geçersiz değer, tekrar giriniz:");
            selectWeaponID= inp.nextInt();
        }
        if(selectWeaponID!=0) {

            Weapon selectedWeapon = Weapon.getWeaponObjById(selectWeaponID);
            if (selectedWeapon != null) {
                if (selectedWeapon.getPrice() > this.getPlayer().getMoney()) {
                    System.out.println("Bakiyeniz yetersiz.");
                } else {
                    System.out.println(selectedWeapon.getName() + " silahını satın aldınız.");
                    int balance = this.getPlayer().getMoney() - selectedWeapon.getPrice();
                    this.getPlayer().setMoney(balance);
                    System.out.println("Bakiye: " + this.getPlayer().getMoney());
                    this.getPlayer().getInventory().setWeapon(selectedWeapon);
                }
            }
        }
    }
    public void printArmor(){
        System.out.println("--------zırhlar--------");
        for(Armor a: Armor.armors()) {
            System.out.println(a.getId()+" - "+a.getName()+" <Ücreti: "+a.getPrice()+", Zırh: "+a.getBlock()+">");
        }
        System.out.println("0 - Çıkış Yap");
    }
    public void buyArmor(){
        System.out.print("Bir zırh seçiniz:");
        int selectArmorID= inp.nextInt();
        while (selectArmorID<0 || selectArmorID>Armor.armors().length){
            System.out.print("Geçersiz değer, tekrar giriniz:");
            selectArmorID= inp.nextInt();
        }
        if (selectArmorID!=0) {
            Armor selectedArmor = Armor.getArmorObjById(selectArmorID);
            if (selectedArmor != null) {
                if (selectedArmor.getPrice() > this.getPlayer().getMoney()) {
                    System.out.println("Bakiyeniz yetersiz.");
                } else {
                    System.out.println(selectedArmor.getName() + " zırhı satın aldınız.");
                    int balance = this.getPlayer().getMoney() - selectedArmor.getPrice();
                    this.getPlayer().setMoney(balance);
                    System.out.println("Bakiye: " + this.getPlayer().getMoney());
                    this.getPlayer().getInventory().setArmor(selectedArmor);
                }
            }
        }
    }
}
