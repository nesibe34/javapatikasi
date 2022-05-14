import java.util.Random;

public class Inventory {
    private Weapon weapon;
    private Armor armor;
    private boolean food;
    private boolean firewood;
    private boolean water;
    private int coin;
    public Inventory(){
        this.weapon=new Weapon("yumruk",-1,0,0);
        this.armor=new Armor("Yok",-1,0,0);
        this.food=false;
        this.firewood=false;
        this.water=false;
        this.coin=0;
    }
    public void gainAward(String locName){
        switch (locName){
            case "Mağara":
                this.setFood(true);
                break;
            case "Orman":
                this.setFirewood(true);
                break;
            case "Nehir":
                this.setWater(true);
                break;
        }
    }

    public double randomAward(){
        Random r=new Random();
        return r.nextInt(1000);
    }

    public void giveAward(){

            if (randomAward()<30){
                System.out.println("tüfek kazandınız.");
                this.setWeapon(Weapon.getWeaponObjById(3));
            }else if (randomAward()>=30 && randomAward()<75){
                System.out.println("kılıç kazandınız.");
                this.setWeapon(Weapon.getWeaponObjById(2));
            }else if (randomAward()>=75 && randomAward()<150){
                System.out.println("tabanca kazandınız.");
                this.setWeapon(Weapon.getWeaponObjById(1));
            }else if (randomAward()<=150 && randomAward()<180){
                System.out.println("ağır zırh kazandınız.");
                this.setArmor(Armor.getArmorObjById(3));
            }else if (randomAward()>=180 && randomAward()<225){
                System.out.println("orta zırh kazandınız.");
                this.setArmor(Armor.getArmorObjById(2));
            }else if (randomAward()>=225 && randomAward()<300){
                System.out.println("hafif zırh kazandınız.");
                this.setArmor(Armor.getArmorObjById(1));
            }else if (randomAward()<=300 && randomAward()<350){
                System.out.println("10 altın kazandınız.");
                this.setCoin(10);
            }else if (randomAward()>=350 && randomAward()<425){
                System.out.println("5 altın kazandınız.");
                this.setCoin(5);
            }else if (randomAward()>=425 && randomAward()<550){
                System.out.println("1 altın kazandınız.");
                this.setCoin(1);
            }else {
            System.out.println("Malesef eşya kazanamadınız.");
            }
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public boolean isFood() {
        return food;
    }

    public void setFood(boolean food) {
        this.food = food;
    }

    public boolean isFirewood() {
        return firewood;
    }

    public void setFirewood(boolean firewood) {
        this.firewood = firewood;
    }

    public boolean isWater() {
        return water;
    }

    public void setWater(boolean water) {
        this.water = water;
    }

    public int getCoin() {
        return coin;
    }

    public void setCoin(int coin) {
        this.coin = coin;
    }
}
