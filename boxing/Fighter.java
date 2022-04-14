public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    double dodge;

    Fighter(String name, int damage, int health, int weight,double dodge) {
        this.name=name;
        this.damage=damage;
        this.health=health;
        this.weight=weight;
        if (dodge>=0 && dodge<=100){
            this.dodge=dodge;
        }else{
            this.dodge=0;
        }
    }
    int hit(Fighter foe){
        System.out.println(this.name+"=>"+foe.name+" hit "+this.damage+" damage");
        if (foe.isDodge()){
            System.out.println(foe.name+" blocked the damage");
            return foe.health;
        }
        if (foe.health-this.damage<0){
            return 0;
        }
        return foe.health-this.damage;
    }
    boolean isDodge(){
        double randomNumber=Math.random()*100;
        return randomNumber<=this.dodge;
    }

}

