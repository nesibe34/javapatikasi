import java.util.Scanner;

public class Player {
    private int damage;
    private int health;
    private int orjHealth;
    private int money;
    private String name;
    private String charName;
    private Inventory inventory;

    Scanner inp=new Scanner(System.in);

    public Player(String name){
        this.name=name;
        this.inventory=new Inventory();
    }
    public void selectChar(){
        GameCharacter[] gameCharList={new Samurai(),new Archer(),new Knight()};
        System.out.println("----------------------------------------------------------------------");
        for (GameCharacter gameCharacter:  gameCharList) {
            System.out.println("ID:\t"+gameCharacter.getId()+
                               "\t\tKarakter:\t"+gameCharacter.getName()+
                               "\t\tHasar:\t"+gameCharacter.getDamage()+
                               "\tSağlık:\t"+gameCharacter.getHealth()+
                               "\tPara:\t"+gameCharacter.getMoney());
        }
        System.out.println("----------------------------------------------------------------------");
        System.out.print("Oyuna başlamak için lütfen bir karakter seçiniz:");
        int selectChar= inp.nextInt();
        switch (selectChar){
            case 1:
                initPlayer(new Samurai());
                break;
            case 2:
                initPlayer(new Archer());
                break;
            case 3:
                initPlayer(new Knight());
                break;
            default:
                initPlayer(new Samurai());
                break;
        }

    }
    public void initPlayer(GameCharacter gameCharacter){
        this.setCharName(gameCharacter.getName());
        this.setDamage(gameCharacter.getDamage());
        this.setHealth(gameCharacter.getHealth());
        this.setOrjHealth(gameCharacter.getHealth());
        this.setMoney(gameCharacter.getMoney());
    }
    public void printInfo(){
        System.out.println("Silahınız: "+this.getInventory().getWeapon().getName()+
                ", Zırh: "+this.getInventory().getArmor().getName()+
                ", bloklama "+this.getInventory().getArmor().getBlock()+
                ", hasarınız "+this.getTotalDamage()+
                ", sağlığı "+this.getHealth()+
                ", parası "+this.getMoney()+".");

    }
    public int getTotalDamage() {
        return damage+this.getInventory().getWeapon().getDamage();
    }

    public int getDamage() {
        return damage;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }
    public int getMoney() {
        return money;
    }
    public void setMoney(int money) {
        this.money = money;
    }
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        if (health<0){
            health=0;
        }
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public int getOrjHealth() {
        return orjHealth;
    }

    public void setOrjHealth(int orjHealth) {
        this.orjHealth = orjHealth;
    }
}
