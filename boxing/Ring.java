public class Ring {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;
    Ring(Fighter f1,Fighter f2,int minWeight,int maxWeight){
        this.f1=f1;
        this.f2=f2;
        this.minWeight=minWeight;
        this.maxWeight=maxWeight;

    }
    public void run(){
        if (isCheck()){
                while (f1.health > 0 && f2.health > 0) {
                    if(isStart()) {
                        System.out.println("====Round====");
                        System.out.println(f1.name + " is starting to the round.");
                        f2.health = f1.hit(f2);
                        System.out.println("remain health " + this.f2.health);
                        if (isWin()) {
                        break;
                         }
                         f1.health = f2.hit(f1);
                         System.out.println("remain health " + this.f1.health);
                         if (isWin()) {
                         break;
                         }
                    }else{
                        System.out.println("====Round====");
                        System.out.println(f2.name + " is starting to the round.");
                        f1.health = f2.hit(f1);
                        System.out.println("remain health " + this.f1.health);
                        if (isWin()) {
                            break;
                        }
                        f2.health = f1.hit(f2);
                        System.out.println("remain health " + this.f2.health);
                        if (isWin()) {
                            break;
                        }
                    }
                }
                System.out.println(this.f1.name + " health " + this.f1.health);
                System.out.println(this.f2.name + " health " + this.f2.health);
        }else{
            System.out.println("Weights of fighters don't match!");
        }

    }
    boolean isCheck(){
        return(this.f1.weight>=minWeight && this.f1.weight<=maxWeight)&&(this.f1.weight>=minWeight && this.f1.weight<=maxWeight);
    }
    boolean isWin(){
        if (this.f1.health==0){
            System.out.println(this.f2.name+" gained.");
            return true;
        }
        if (this.f2.health==0){
            System.out.println(this.f1.name+" gained.");
            return true;
        }
        return false;
    }
    boolean isStart(){
        double randomNum=Math.random()*10;
        return randomNum<=5;
    }
}
