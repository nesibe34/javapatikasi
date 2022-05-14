import java.util.Random;

public class Obstacle {
    private String name;
    private int id;
    private int damage;
    private int health;
    private int coin;
    private int orjHealth;

    public Obstacle(int id,String name, int damage, int health,int coin){
        this.name=name;
        this.id=id;
        this.damage=damage;
        this.health=health;
        this.orjHealth=health;
        this.coin=coin;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
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

    public int getCoin() {
        return coin;
    }

    public void setCoin(int coin) {
        this.coin = coin;
    }

    public int getOrjHealth() {
        return orjHealth;
    }

    public void setOrjHealth(int orjHealth) {
        this.orjHealth = orjHealth;
    }
}
